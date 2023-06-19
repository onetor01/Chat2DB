package com.alibaba.dbhub.server.domain.core.converter;

import com.alibaba.dbhub.server.domain.api.model.Config;
import com.alibaba.dbhub.server.domain.api.param.SystemConfigParam;
import com.alibaba.dbhub.server.domain.repository.entity.SystemConfigDO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T10:48:12+0800",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class ConfigConverterImpl extends ConfigConverter {

    @Override
    public SystemConfigDO param2do(SystemConfigParam param) {
        if ( param == null ) {
            return null;
        }

        SystemConfigDO systemConfigDO = new SystemConfigDO();

        systemConfigDO.setCode( param.getCode() );
        systemConfigDO.setContent( param.getContent() );
        systemConfigDO.setSummary( param.getSummary() );

        return systemConfigDO;
    }

    @Override
    public Config do2model(SystemConfigDO systemConfigDO) {
        if ( systemConfigDO == null ) {
            return null;
        }

        Config config = new Config();

        config.setCode( systemConfigDO.getCode() );
        config.setContent( systemConfigDO.getContent() );
        config.setGmtCreate( systemConfigDO.getGmtCreate() );
        config.setGmtModified( systemConfigDO.getGmtModified() );
        config.setId( systemConfigDO.getId() );
        config.setSummary( systemConfigDO.getSummary() );

        return config;
    }
}
