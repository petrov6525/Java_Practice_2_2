package Task_5;

import java.util.Date;

public class Visa {
    protected VisaSource visa_source;
    protected Date exists_time;
    protected Date source_time;

    public Visa(VisaSource visa_source, Date exists_time, Date source_time) {
        this.visa_source = visa_source;
        this.exists_time = exists_time;
        this.source_time = source_time;
    }

    public Visa () {

    }

    public VisaSource getVisa_source() {
        return visa_source;
    }

    public void setVisa_source(VisaSource visa_source) {
        this.visa_source = visa_source;
    }

    public Date getExists_time() {
        return exists_time;
    }

    public void setExists_time(Date exists_time) {
        this.exists_time = exists_time;
    }

    public Date getSource_time() {
        return source_time;
    }

    public void setSource_time(Date source_time) {
        this.source_time = source_time;
    }
}
