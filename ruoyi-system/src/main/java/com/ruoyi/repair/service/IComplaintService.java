package com.ruoyi.repair.service;

import java.util.List;
import com.ruoyi.repair.domain.Complaint;

/**
 * 投诉Service接口
 * 
 * @author student
 * @date 2023-01-04
 */
public interface IComplaintService 
{
    /**
     * 查询投诉
     * 
     * @param id 投诉主键
     * @return 投诉
     */
    public Complaint selectComplaintById(Long id);

    /**
     * 查询投诉列表
     * 
     * @param complaint 投诉
     * @return 投诉集合
     */
    public List<Complaint> selectComplaintList(Complaint complaint);

    /**
     * 新增投诉
     * 
     * @param complaint 投诉
     * @return 结果
     */
    public int insertComplaint(Complaint complaint);

    /**
     * 修改投诉
     * 
     * @param complaint 投诉
     * @return 结果
     */
    public int updateComplaint(Complaint complaint);

    /**
     * 批量删除投诉
     * 
     * @param ids 需要删除的投诉主键集合
     * @return 结果
     */
    public int deleteComplaintByIds(Long[] ids);

    /**
     * 删除投诉信息
     * 
     * @param id 投诉主键
     * @return 结果
     */
    public int deleteComplaintById(Long id);
}
