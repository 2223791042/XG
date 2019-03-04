package mr.s.converter;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 实体类到DTO的转换器
 * @param <E>
 * @param <D>
 */
public class EntityToDTOConverter<E,D> {
    public D convert(E e, Class<D> dClass){
      try{
          D d = dClass.newInstance();
          BeanUtils.copyProperties(e, d);
          return d;
      }catch (Exception ex){
          ex.printStackTrace();
          return null;
      }
    }
    public List<D> convert(List<E> eList, Class<D> dClass){
        List<D> dList = new ArrayList<D>();
        for(E e : eList){
            dList.add(convert(e, dClass));
        }
        return dList;
    }
}
