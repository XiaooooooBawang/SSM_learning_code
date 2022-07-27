package com.XiaooooooBawang.mapper;

import com.XiaooooooBawang.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    List<Brand> selectAll();


    @Select("select * from tb_brand where id = #{id}")
    //注解完成简单功能，配置文件完成复杂功能
    Brand selectById(int id);

    /*
     * 条件查询
     */
//    List<Brand> selectByCondition(
//            @Param("status") int status,
//            @Param("companyName") String CompanyName,
//            @Param("brandName") String brandName
//    );


//    List<Brand> selectByCondition(Brand brand);

    List<Brand> selectByCondition(Map map);

    List<Brand> selectByDynamicCondition(Map map);

    void add(Brand brand);
    void update(Brand brand);

    void deleteById(int id);

    void deleteByIds(int[] ids);
}
