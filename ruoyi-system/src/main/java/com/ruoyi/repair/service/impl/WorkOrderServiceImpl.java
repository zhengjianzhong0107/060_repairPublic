package com.ruoyi.repair.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.repair.mapper.WorkOrderMapper;
import com.ruoyi.repair.domain.WorkOrder;
import com.ruoyi.repair.service.IWorkOrderService;

/**
 * 维修工单Service业务层处理
 * 
 * @author student
 * @date 2023-01-04
 */
@Service
public class WorkOrderServiceImpl implements IWorkOrderService 
{
    @Autowired
    private WorkOrderMapper workOrderMapper;

    /**
     * 查询维修工单
     * 
     * @param id 维修工单主键
     * @return 维修工单
     */
    @Override
    public WorkOrder selectWorkOrderById(Long id)
    {
        return workOrderMapper.selectWorkOrderById(id);
    }

    /**
     * 查询维修工单列表
     * 
     * @param workOrder 维修工单
     * @return 维修工单
     */
    @Override
    public List<WorkOrder> selectWorkOrderList(WorkOrder workOrder)
    {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        SysUser user = loginUser.getUser();
        if(3 == user.getRoles().get(0).getRoleId()){
            workOrder.setHandleUser(loginUser.getUserId());
        }
        if(2 == user.getRoles().get(0).getRoleId()){
            workOrder.setCreateBy(loginUser.getUserId().toString());
        }
        return workOrderMapper.selectWorkOrderList(workOrder);
    }

    /**
     * 新增维修工单
     * 
     * @param workOrder 维修工单
     * @return 结果
     */
    @Override
    public int insertWorkOrder(WorkOrder workOrder)
    {
        workOrder.setStatus("1");
        LoginUser loginUser = SecurityUtils.getLoginUser();
        workOrder.setCreateBy(loginUser.getUserId().toString());
        workOrder.setCreateTime(DateUtils.getNowDate());
        return workOrderMapper.insertWorkOrder(workOrder);
    }

    /**
     * 修改维修工单
     * 
     * @param workOrder 维修工单
     * @return 结果
     */
    @Override
    public int updateWorkOrder(WorkOrder workOrder)
    {
        workOrder.setUpdateTime(DateUtils.getNowDate());
        return workOrderMapper.updateWorkOrder(workOrder);
    }

    /**
     * 批量删除维修工单
     * 
     * @param ids 需要删除的维修工单主键
     * @return 结果
     */
    @Override
    public int deleteWorkOrderByIds(Long[] ids)
    {
        return workOrderMapper.deleteWorkOrderByIds(ids);
    }

    /**
     * 删除维修工单信息
     * 
     * @param id 维修工单主键
     * @return 结果
     */
    @Override
    public int deleteWorkOrderById(Long id)
    {
        return workOrderMapper.deleteWorkOrderById(id);
    }
}
