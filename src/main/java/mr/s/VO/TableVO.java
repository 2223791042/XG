package mr.s.VO;

import java.util.List;

public class TableVO<T> {
    private Long code;
    private Long count;
    private List<T> data;

    public TableVO() {
    }

    public TableVO(Long count, List<T> data) {
        this.count = count;
        this.data = data;
        this.code = 0L;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
