package com.ruoyi.repair.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.repair.mapper.ComplaintMapper;
import com.ruoyi.repair.domain.Complaint;
import com.ruoyi.repair.service.IComplaintService;

/**
 * 投诉Service业务层处理
 * 
 * @author student
 * @date 2023-01-04
 */
@Service
public class ComplaintServiceImpl implements IComplaintService 
{
    @Autowired
    private ComplaintMapper complaintMapper;

    /**
     * 查询投诉
     * 
     * @param id 投诉主键
     * @return 投诉
     */
    @Override
    public Complaint selectComplaintById(Long id)
    {
        return complaintMapper.selectComplaintById(id);
    }

    /**
     * 查询投诉列表
     * 
     * @param complaint 投诉
     * @return 投诉
     */
    @Override
    public List<Complaint> selectComplaintList(Complaint complaint)
    {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        SysUser user = loginUser.getUser();
        if(3 == user.getRoles().get(0).getRoleId()){
            complaint.setComplaintUser(loginUser.getUserId());
        }
        if(2 == user.getRoles().get(0).getRoleId()){
            complaint.setCreateBy(loginUser.getUserId().toString());
        }
        return complaintMapper.selectComplaintList(complaint);
    }

    /**
     * 新增投诉
     * 
     * @param complaint 投诉
     * @return 结果
     */
    @Override
    public int insertComplaint(Complaint complaint)
    {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        complaint.setCreateBy(loginUser.getUserId().toString());
        complaint.setCreateTime(DateUtils.getNowDate());
        return complaintMapper.insertComplaint(complaint);
    }

    /**
     * 修改投诉
     * 
     * @param complaint 投诉
     * @return 结果
     */
    @Override
    public int updateComplaint(Complaint complaint)
    {
        complaint.setUpdateTime(DateUtils.getNowDate());
        return complaintMapper.updateComplaint(complaint);
    }

    /**
     * 批量删除投诉
     * 
     * @param ids 需要删除的投诉主键
     * @return 结果
     */
    @Override
    public int deleteComplaintByIds(Long[] ids)
    {
        return complaintMapper.deleteComplaintByIds(ids);
    }

    /**
     * 删除投诉信息
     * 
     * @param id 投诉主键
     * @return 结果
     */
    @Override
    public int deleteComplaintById(Long id)
    {
        return complaintMapper.deleteComplaintById(id);
    }
}
