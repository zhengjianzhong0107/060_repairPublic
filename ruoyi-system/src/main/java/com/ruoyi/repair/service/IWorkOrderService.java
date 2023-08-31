package com.ruoyi.repair.service;

import java.util.List;
import com.ruoyi.repair.domain.WorkOrder;

/**
 * 维修工单Service接口
 * 
 * @author student
 * @date 2023-01-04
 */
public interface IWorkOrderService 
{
    /**
     * 查询维修工单
     * 
     * @param id 维修工单主键
     * @return 维修工单
     */
    public WorkOrder selectWorkOrderById(Long id);

    /**
     * 查询维修工单列表
     * 
     * @param workOrder 维修工单
     * @return 维修工单集合
     */
    public List<WorkOrder> selectWorkOrderList(WorkOrder workOrder);

    /**
     * 新增维修工单
     * 
     * @param workOrder 维修工单
     * @return 结果
     */
    public int insertWorkOrder(WorkOrder workOrder);

    /**
     * 修改维修工单
     * 
     * @param workOrder 维修工单
     * @return 结果
     */
    public int updateWorkOrder(WorkOrder workOrder);

    /**
     * 批量删除维修工单
     * 
     * @param ids 需要删除的维修工单主键集合
     * @return 结果
     */
    public int deleteWorkOrderByIds(Long[] ids);

    /**
     * 删除维修工单信息
     * 
     * @param id 维修工单主键
     * @return 结果
     */
    public int deleteWorkOrderById(Long id);
}
