package com.lizhenfang.lizhenfangday01.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lizhenfang.lizhenfangday01.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lizhenfang.lizhenfangday01.entity.RoleVo;
import com.lizhenfang.lizhenfangday01.entity.UserVo;

/**
 * <p>
 * InnoDB free: 37888 kB Mapper 接口
 * </p>
 *
 * @author @李振芳
 * @since 2020-03-30
 */
public interface RoleMapper extends BaseMapper<Role> {
    IPage<RoleVo> selectPageVo2(Page page, RoleVo vo);
}
