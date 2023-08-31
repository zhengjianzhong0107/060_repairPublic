package com.ruoyi.repair.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.repair.mapper.OrderTypeMapper;
import com.ruoyi.repair.domain.OrderType;
import com.ruoyi.repair.service.IOrderTypeService;

/**
 * 工单类型Service业务层处理
 * 
 * @author student
 * @date 2023-01-04
 */
@Service
public class OrderTypeServiceImpl implements IOrderTypeService 
{
    @Autowired
    private OrderTypeMapper orderTypeMapper;

    /**
     * 查询工单类型
     * 
     * @param id 工单类型主键
     * @return 工单类型
     */
    @Override
    public OrderType selectOrderTypeById(Long id)
    {
        return orderTypeMapper.selectOrderTypeById(id);
    }

    /**
     * 查询工单类型列表
     * 
     * @param orderType 工单类型
     * @return 工单类型
     */
    @Override
    public List<OrderType> selectOrderTypeList(OrderType orderType)
    {
        return orderTypeMapper.selectOrderTypeList(orderType);
    }

    /**
     * 新增工单类型
     * 
     * @param orderType 工单类型
     * @return 结果
     */
    @Override
    public int insertOrderType(OrderType orderType)
    {
        orderType.setCreateTime(DateUtils.getNowDate());
        return orderTypeMapper.insertOrderType(orderType);
    }

    /**
     * 修改工单类型
     * 
     * @param orderType 工单类型
     * @return 结果
     */
    @Override
    public int updateOrderType(OrderType orderType)
    {
        orderType.setUpdateTime(DateUtils.getNowDate());
        return orderTypeMapper.updateOrderType(orderType);
    }

    /**
     * 批量删除工单类型
     * 
     * @param ids 需要删除的工单类型主键
     * @return 结果
     */
    @Override
    public int deleteOrderTypeByIds(Long[] ids)
    {
        return orderTypeMapper.deleteOrderTypeByIds(ids);
    }

    /**
     * 删除工单类型信息
     * 
     * @param id 工单类型主键
     * @return 结果
     */
    @Override
    public int deleteOrderTypeById(Long id)
    {
        return orderTypeMapper.deleteOrderTypeById(id);
    }
}
