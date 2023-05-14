package com.shier.shierbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shier.shierbi.model.entity.Chart;
import com.shier.shierbi.service.ChartService;
import com.shier.shierbi.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author Shier
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2023-05-14 19:20:33
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




