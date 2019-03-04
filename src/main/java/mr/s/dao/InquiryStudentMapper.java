package mr.s.dao;

import java.util.List;
import mr.s.entity.InquiryStudent;
import mr.s.entity.InquiryStudentExample;
import org.apache.ibatis.annotations.Param;

public interface InquiryStudentMapper {
    long countByExample(InquiryStudentExample example);

    int deleteByExample(InquiryStudentExample example);

    int deleteByPrimaryKey(String stuID);

    int insert(InquiryStudent record);

    int insertSelective(InquiryStudent record);

    List<InquiryStudent> selectByExample(InquiryStudentExample example);

    InquiryStudent selectByPrimaryKey(String stuID);

    int updateByExampleSelective(@Param("record") InquiryStudent record, @Param("example") InquiryStudentExample example);

    int updateByExample(@Param("record") InquiryStudent record, @Param("example") InquiryStudentExample example);

    int updateByPrimaryKeySelective(InquiryStudent record);

    int updateByPrimaryKey(InquiryStudent record);
}