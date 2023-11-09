package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ChargingPile;

/**
 * 充电桩Mapper接口
 * 
 * @author ruoyi
 * @date 2023-01-14
 */
public interface ChargingPileMapper 
{
    /**
     * 查询充电桩
     * 
     * @param id 充电桩主键
     * @return 充电桩
     */
    public ChargingPile selectChargingPileById(Long id);

    /**
     * 查询充电桩列表
     * 
     * @param chargingPile 充电桩
     * @return 充电桩集合
     */
    public List<ChargingPile> selectChargingPileList(ChargingPile chargingPile);

    /**
     * 新增充电桩
     * 
     * @param chargingPile 充电桩
     * @return 结果
     */
    public int insertChargingPile(ChargingPile chargingPile);

    /**
     * 修改充电桩
     * 
     * @param chargingPile 充电桩
     * @return 结果
     */
    public int updateChargingPile(ChargingPile chargingPile);

    /**
     * 删除充电桩
     * 
     * @param id 充电桩主键
     * @return 结果
     */
    public int deleteChargingPileById(Long id);

    /**
     * 批量删除充电桩
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChargingPileByIds(Long[] ids);
}
