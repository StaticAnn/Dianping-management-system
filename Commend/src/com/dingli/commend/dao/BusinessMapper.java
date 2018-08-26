package com.dingli.commend.dao;

import com.dingli.commend.bean.Business;
import com.dingli.commend.bean.BusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessMapper {
	
	List<Business> selectAllBus();
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int countByExample(BusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int deleteByExample(BusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int insert(Business record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int insertSelective(Business record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    List<Business> selectByExample(BusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    Business selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") Business record, @Param("example") BusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int updateByExample(@Param("record") Business record, @Param("example") BusinessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int updateByPrimaryKeySelective(Business record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int updateByPrimaryKey(Business record);
}