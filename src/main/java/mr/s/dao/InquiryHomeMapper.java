package mr.s.dao;

import java.util.List;
import mr.s.entity.InquiryHome;
import mr.s.entity.InquiryHomeExample;
import org.apache.ibatis.annotations.Param;

public interface InquiryHomeMapper {
    long countByExample(InquiryHomeExample example);

    int deleteByExample(InquiryHomeExample example);

    int deleteByPrimaryKey(Long inquiryID);

    int insert(InquiryHome record);

    int insertSelective(InquiryHome record);

    List<InquiryHome> selectByExample(InquiryHomeExample example);

    InquiryHome selectByPrimaryKey(Long inquiryID);

    int updateByExampleSelective(@Param("record") InquiryHome record, @Param("example") InquiryHomeExample example);

    int updateByExample(@Param("record") InquiryHome record, @Param("example") InquiryHomeExample example);

    int updateByPrimaryKeySelective(InquiryHome record);

    int updateByPrimaryKey(InquiryHome record);
}