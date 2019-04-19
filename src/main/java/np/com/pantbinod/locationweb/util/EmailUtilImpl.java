package np.com.pantbinod.locationweb.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
@Component
public class EmailUtilImpl implements EmailUtil {


    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(String toAddress, String subject, String body) {

        MimeMessage  message = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(message);
        try {

        messageHelper.setTo(toAddress);
        message.setSubject(subject);
        messageHelper.setText(body);
        javaMailSender.send(message);

        }catch (Exception e){

        }

    }
}
