package com.alibaba.dbhub.server.domain.core.converter;

import com.alibaba.dbhub.server.domain.api.model.DataSource;
import com.alibaba.dbhub.server.domain.api.param.ConsoleConnectParam;
import com.alibaba.dbhub.server.domain.api.param.ConsoleCreateParam;
import com.alibaba.dbhub.server.domain.api.param.DataSourceCreateParam;
import com.alibaba.dbhub.server.domain.api.param.DataSourcePreConnectParam;
import com.alibaba.dbhub.server.domain.api.param.DataSourceTestParam;
import com.alibaba.dbhub.server.domain.api.param.DataSourceUpdateParam;
import com.alibaba.dbhub.server.domain.repository.entity.DataSourceDO;
import com.alibaba.dbhub.server.domain.support.model.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T10:48:12+0800",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class DataSourceConverterImpl extends DataSourceConverter {

    @Override
    public DataSourceDO param2do(DataSourceCreateParam param) {
        if ( param == null ) {
            return null;
        }

        DataSourceDO dataSourceDO = new DataSourceDO();

        dataSourceDO.setAlias( param.getAlias() );
        dataSourceDO.setDriver( param.getDriver() );
        dataSourceDO.setEnvType( param.getEnvType() );
        dataSourceDO.setHost( param.getHost() );
        dataSourceDO.setJdbc( param.getJdbc() );
        dataSourceDO.setPort( param.getPort() );
        dataSourceDO.setSid( param.getSid() );
        dataSourceDO.setType( param.getType() );
        dataSourceDO.setUrl( param.getUrl() );
        dataSourceDO.setUserName( param.getUserName() );

        dataSourceDO.setPassword( encryptString(param) );
        dataSourceDO.setSsh( param.getSsh()==null?null: com.alibaba.fastjson2.JSON.toJSONString(param.getSsh()) );
        dataSourceDO.setSsl( param.getSsl()==null?null: com.alibaba.fastjson2.JSON.toJSONString(param.getSsl()) );
        dataSourceDO.setExtendInfo( param.getExtendInfo()==null?null: com.alibaba.fastjson2.JSON.toJSONString(param.getExtendInfo()) );

        return dataSourceDO;
    }

    @Override
    public DataSourceDO param2do(DataSourceUpdateParam param) {
        if ( param == null ) {
            return null;
        }

        DataSourceDO dataSourceDO = new DataSourceDO();

        dataSourceDO.setAlias( param.getAlias() );
        dataSourceDO.setDriver( param.getDriver() );
        dataSourceDO.setEnvType( param.getEnvType() );
        dataSourceDO.setHost( param.getHost() );
        dataSourceDO.setId( param.getId() );
        dataSourceDO.setJdbc( param.getJdbc() );
        dataSourceDO.setPort( param.getPort() );
        dataSourceDO.setSid( param.getSid() );
        dataSourceDO.setType( param.getType() );
        dataSourceDO.setUrl( param.getUrl() );
        dataSourceDO.setUserName( param.getUserName() );

        dataSourceDO.setPassword( encryptString(param) );
        dataSourceDO.setSsh( param.getSsh()==null?null: com.alibaba.fastjson2.JSON.toJSONString(param.getSsh()) );
        dataSourceDO.setSsl( param.getSsl()==null?null: com.alibaba.fastjson2.JSON.toJSONString(param.getSsl()) );
        dataSourceDO.setExtendInfo( param.getExtendInfo()==null?null: com.alibaba.fastjson2.JSON.toJSONString(param.getExtendInfo()) );

        return dataSourceDO;
    }

    @Override
    public ConsoleCreateParam param2consoleParam(ConsoleConnectParam param) {
        if ( param == null ) {
            return null;
        }

        ConsoleCreateParam consoleCreateParam = new ConsoleCreateParam();

        consoleCreateParam.setConsoleId( param.getConsoleId() );
        consoleCreateParam.setDataSourceId( param.getDataSourceId() );
        consoleCreateParam.setDatabaseName( param.getDatabaseName() );

        return consoleCreateParam;
    }

    @Override
    public DataSourceTestParam param2param(DataSourcePreConnectParam dataSourcePreConnectParam) {
        if ( dataSourcePreConnectParam == null ) {
            return null;
        }

        DataSourceTestParam dataSourceTestParam = new DataSourceTestParam();

        dataSourceTestParam.setDbType( dataSourcePreConnectParam.getType() );
        dataSourceTestParam.setUsername( dataSourcePreConnectParam.getUser() );
        dataSourceTestParam.setDriver( dataSourcePreConnectParam.getDriver() );
        List<KeyValue> list = dataSourcePreConnectParam.getExtendInfo();
        if ( list != null ) {
            dataSourceTestParam.setExtendInfo( new ArrayList<KeyValue>( list ) );
        }
        dataSourceTestParam.setHost( dataSourcePreConnectParam.getHost() );
        dataSourceTestParam.setJdbc( dataSourcePreConnectParam.getJdbc() );
        dataSourceTestParam.setPassword( dataSourcePreConnectParam.getPassword() );
        dataSourceTestParam.setPort( dataSourcePreConnectParam.getPort() );
        dataSourceTestParam.setSid( dataSourcePreConnectParam.getSid() );
        dataSourceTestParam.setSsh( dataSourcePreConnectParam.getSsh() );
        dataSourceTestParam.setSsl( dataSourcePreConnectParam.getSsl() );
        dataSourceTestParam.setUrl( dataSourcePreConnectParam.getUrl() );

        return dataSourceTestParam;
    }

    @Override
    public DataSource do2dto(DataSourceDO dataSourceDO) {
        if ( dataSourceDO == null ) {
            return null;
        }

        DataSource dataSource = new DataSource();

        dataSource.setAlias( dataSourceDO.getAlias() );
        dataSource.setDriver( dataSourceDO.getDriver() );
        dataSource.setEnvType( dataSourceDO.getEnvType() );
        dataSource.setGmtCreate( dataSourceDO.getGmtCreate() );
        dataSource.setGmtModified( dataSourceDO.getGmtModified() );
        dataSource.setHost( dataSourceDO.getHost() );
        dataSource.setId( dataSourceDO.getId() );
        dataSource.setJdbc( dataSourceDO.getJdbc() );
        dataSource.setPort( dataSourceDO.getPort() );
        dataSource.setSid( dataSourceDO.getSid() );
        dataSource.setType( dataSourceDO.getType() );
        dataSource.setUrl( dataSourceDO.getUrl() );
        dataSource.setUserName( dataSourceDO.getUserName() );

        dataSource.setPassword( decryptString(dataSourceDO) );
        dataSource.setSsh( com.alibaba.fastjson2.JSON.parseObject(dataSourceDO.getSsh(),com.alibaba.dbhub.server.domain.support.model.SSHInfo.class) );
        dataSource.setSsl( com.alibaba.fastjson2.JSON.parseObject(dataSourceDO.getSsl(),com.alibaba.dbhub.server.domain.support.model.SSLInfo.class) );
        dataSource.setExtendInfo( com.alibaba.fastjson2.JSON.parseArray(dataSourceDO.getExtendInfo(),KeyValue.class) );

        return dataSource;
    }

    @Override
    public List<DataSource> do2dto(List<DataSourceDO> dataSourceDOList) {
        if ( dataSourceDOList == null ) {
            return null;
        }

        List<DataSource> list = new ArrayList<DataSource>( dataSourceDOList.size() );
        for ( DataSourceDO dataSourceDO : dataSourceDOList ) {
            list.add( do2dto( dataSourceDO ) );
        }

        return list;
    }
}
