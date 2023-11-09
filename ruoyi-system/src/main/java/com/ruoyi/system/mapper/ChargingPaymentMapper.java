package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ChargingPayment;

/**
 * 支付订单Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-12
 */
public interface ChargingPaymentMapper 
{
    /**
     * 查询支付订单
     * 
     * @param sysId 支付订单主键
     * @return 支付订单
     */
    public ChargingPayment selectChargingPaymentBySysId(Long sysId);

    /**
     * 查询支付订单列表
     * 
     * @param chargingPayment 支付订单
     * @return 支付订单集合
     */
    public List<ChargingPayment> selectChargingPaymentList(ChargingPayment chargingPayment);

    /**
     * 新增支付订单
     * 
     * @param chargingPayment 支付订单
     * @return 结果
     */
    public int insertChargingPayment(ChargingPayment chargingPayment);

    /**
     * 修改支付订单
     * 
     * @param chargingPayment 支付订单
     * @return 结果
     */
    public int updateChargingPayment(ChargingPayment chargingPayment);

    /**
     * 删除支付订单
     * 
     * @param sysId 支付订单主键
     * @return 结果
     */
    public int deleteChargingPaymentBySysId(Long sysId);

    /**
     * 批量删除支付订单
     * 
     * @param sysIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingPaymentBySysIds(Long[] sysIds);
}
