package com.example.mybatisplus.city.service.impl;

import com.example.mybatisplus.city.entity.City;
import com.example.mybatisplus.city.mapper.CityMapper;
import com.example.mybatisplus.city.service.ICityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Fan
 * @since 2021-07-15
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements ICityService {

}
