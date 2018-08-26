package com.dingli.commend.dao;

import com.dingli.commend.bean.Dictype;
import com.dingli.commend.bean.DictypeExample;
import com.dingli.commend.bean.DictypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int countByExample(DictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int deleteByExample(DictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int deleteByPrimaryKey(DictypeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int insert(Dictype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int insertSelective(Dictype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    List<Dictype> selectByExample(DictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    Dictype selectByPrimaryKey(DictypeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") Dictype record, @Param("example") DictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int updateByExample(@Param("record") Dictype record, @Param("example") DictypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int updateByPrimaryKeySelective(Dictype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic
     *
     * @mbggenerated Wed Aug 15 16:30:44 CST 2018
     */
    int updateByPrimaryKey(Dictype record);
}