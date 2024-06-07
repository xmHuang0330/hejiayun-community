package .service.impl;

import .entity.SysArea;
import .dao.SysAreaDao;
import .service.SysAreaService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 区域表(SysArea)表服务实现类
 *
 * @author makejava
 * @since 2024-06-07 16:47:18
 */
@Service("sysAreaService")
public class SysAreaServiceImpl implements SysAreaService {
    @Resource
    private SysAreaDao sysAreaDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysArea queryById(Integer id) {
        return this.sysAreaDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysArea 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SysArea> queryByPage(SysArea sysArea, PageRequest pageRequest) {
        long total = this.sysAreaDao.count(sysArea);
        return new PageImpl<>(this.sysAreaDao.queryAllByLimit(sysArea, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param sysArea 实例对象
     * @return 实例对象
     */
    @Override
    public SysArea insert(SysArea sysArea) {
        this.sysAreaDao.insert(sysArea);
        return sysArea;
    }

    /**
     * 修改数据
     *
     * @param sysArea 实例对象
     * @return 实例对象
     */
    @Override
    public SysArea update(SysArea sysArea) {
        this.sysAreaDao.update(sysArea);
        return this.queryById(sysArea.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysAreaDao.deleteById(id) > 0;
    }
}
