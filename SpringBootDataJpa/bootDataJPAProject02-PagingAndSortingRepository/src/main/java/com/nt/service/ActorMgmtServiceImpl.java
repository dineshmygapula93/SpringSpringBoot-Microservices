package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {

	@Autowired
	private IActorRepository actorrepo;

	@Override
	public Iterable<Actor> showActorsSorted(Boolean ascOrder, String... props) {

		Sort sort = Sort.by(ascOrder ? Sort.Direction.ASC : Sort.Direction.DESC, props);
		Iterable<Actor> list = actorrepo.findAll(sort);
		return list;
	}

	@Override
	public Page<Actor> showActorsByPageNo(int pageNo, int pageSize) {

		Pageable pageable = PageRequest.of(pageNo, pageSize);

		Page page = actorrepo.findAll(pageable);
		return page;
	}

	@Override
	public Page<Actor> showActorsByPageNoAsSorted(int pageNo, int pageSize, Boolean ascOrder, String... props) {

		Sort sort = Sort.by(ascOrder ? Sort.Direction.ASC : Sort.Direction.DESC, props);

		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

		return actorrepo.findAll(pageable);
	}

	@Override
	public void showActorsDateByPagination(int pageSize) {
		long count = actorrepo.count();

		long pagescount = count / pageSize;

		if (count % pageSize != 0) {
			pagescount++;
		}

		for (int i = 0; i < pagescount; i++) {
			Pageable pageable = PageRequest.of(i, pageSize);

			Page<Actor> page = actorrepo.findAll(pageable);
			System.out.println(page.getNumber() + 1 + "/" + page.getTotalPages() + "records are");
			page.forEach(System.out::println);

		}

	}

}
