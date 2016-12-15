package dao;

/**
 * Created by simon on 15/12/16.
 */
public class Pagination {

    private Integer startValue;
    private Integer endValue;

    public Pagination() {
        this.startValue = 0;
        this.endValue = 20;
    }

    public Pagination(final Integer startValue, final Integer endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    public Integer getStartValue() {
        return startValue;
    }

    public Integer getEndValue() {
        return endValue;
    }
}
