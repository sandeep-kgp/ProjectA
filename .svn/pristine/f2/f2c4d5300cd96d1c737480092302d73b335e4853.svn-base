
package nc.dhhs.nccss.acts.ecoa.web.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * @author Phani Konuru
 *
 */
public class EmailManager
{

	/**
	 * 
	 */
	public EmailManager()
	{
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(String to, String from, String sub, String msgBody)
	{

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(sub);
		message.setText(msgBody);
		mailSender.send(message);
	}

	// added to send HTML/MIME/Rich text mails.
	public void sendHtmlMail(String to, String from, String subject, String msg) throws Exception

	{

		MimeMessage message = mailSender.createMimeMessage();

		message.setSubject(subject);

		MimeMessageHelper helper;

		helper = new MimeMessageHelper(message, true);

		helper.setFrom(from);

		helper.setTo(to);

		helper.setText(msg, true);

		mailSender.send(message);

	}
}
