package kata4.view;


import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> mails) {
        Histogram<String> histogram = new Histogram<>();
        mails.forEach((mails2) -> {
            histogram.increment(mails2.getDomain());
        });
        return histogram;
    }    
    
}
