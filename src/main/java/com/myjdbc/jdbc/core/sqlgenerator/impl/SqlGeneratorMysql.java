package com.myjdbc.jdbc.core.sqlgenerator.impl;


import com.myjdbc.core.util.ClassUtil;
import com.myjdbc.core.util.ListUtil;
import com.myjdbc.core.util.StringUtil;
import com.myjdbc.jdbc.constants.MyCascade;
import com.myjdbc.jdbc.core.bo.DeleteEntity;
import com.myjdbc.jdbc.core.bo.SavaEntity;
import com.myjdbc.jdbc.core.bo.SavaListEntity;
import com.myjdbc.jdbc.core.service.CriteriaQuery;
import com.myjdbc.jdbc.core.sqlgenerator.SqlGenerator;
import com.myjdbc.jdbc.util.BeanUtil;
import com.myjdbc.jdbc.util.BeanUtilOracle;
import com.myjdbc.jdbc.util.UUIDHexGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 陈文
 * @Date 2019/12/26  12:38
 * @Description Mysql数据库的SQL生成器
 */
@Service("sqlGeneratorMysql")
public class SqlGeneratorMysql extends SqlGeneratorBase implements SqlGenerator {
    private static final Logger logger = LoggerFactory.getLogger(SqlGeneratorMysql.class);

    /* 日期转换格式 */
    protected static final String todate = "date_format(?, '%Y-%m-%d %H:%i:%s')";


}
