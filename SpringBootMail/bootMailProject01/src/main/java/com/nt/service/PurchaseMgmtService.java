package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class PurchaseMgmtService implements IPurchaseMgmtService {

	@Autowired
	private JavaMailSender sender;
	@Value("${spring.mail.username}")
	private String fromEmailId;

	@Override
	public String shopping(String[] items, Double[] prices, String[] toEmailIds) throws Exception {
		double totalAmt = 0.0;
		for (double p : prices) {
			totalAmt = totalAmt + p;
		}
		String msg1 = Arrays.toString(items) + " are purchased having  prices" + Arrays.toString(prices)+ "  with the bill amount" + totalAmt;
		String msg2 = sendMail(msg1, toEmailIds, fromEmailId);
		return msg1 + "...." + msg2;
	}

	private String sendMail(String msg, String[] toEmailIds, String fromEmailId) throws Exception {

		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setSentDate(new Date());
		helper.setFrom(fromEmailId);
		helper.setTo(toEmailIds);
		helper.setSubject("open it to know it");
		helper.setText(msg);
		helper.addAttachment("marc.avif", new ClassPathResource("marc.avif"));

		sender.send(message);
		return "email message is  sent";
	}

}
