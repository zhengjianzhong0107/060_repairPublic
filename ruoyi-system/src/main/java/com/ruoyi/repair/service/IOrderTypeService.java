package com.ruoyi.repair.service;

import java.util.List;
import com.ruoyi.repair.domain.OrderType;

/**
 * 工单类型Service接口
 * 
 * @author student
 * @date 2023-01-04
 */
public interface IOrderTypeService 
{
    /**
     * 查询工单类型
     * 
     * @param id 工单类型主键
     * @return 工单类型
     */
    public OrderType selectOrderTypeById(Long id);

    /**
     * 查询工单类型列表
     * 
     * @param orderType 工单类型
     * @return 工单类型集合
     */
    public List<OrderType> selectOrderTypeList(OrderType orderType);

    /**
     * 新增工单类型
     * 
     * @param orderType 工单类型
     * @return 结果
     */
    public int insertOrderType(OrderType orderType);

    /**
     * 修改工单类型
     * 
     * @param orderType 工单类型
     * @return 结果
     */
    public int updateOrderType(OrderType orderType);

    /**
     * 批量删除工单类型
     * 
     * @param ids 需要删除的工单类型主键集合
     * @return 结果
     */
    public int deleteOrderTypeByIds(Long[] ids);

    /**
     * 删除工单类型信息
     * 
     * @param id 工单类型主键
     * @return 结果
     */
    public int deleteOrderTypeById(Long id);
}
