package com.alibaba.dbhub.server.web.api.controller.data.source.converter;

import com.alibaba.dbhub.server.domain.api.model.DataSource;
import com.alibaba.dbhub.server.domain.api.param.ConsoleCloseParam;
import com.alibaba.dbhub.server.domain.api.param.ConsoleConnectParam;
import com.alibaba.dbhub.server.domain.api.param.DataSourceCreateParam;
import com.alibaba.dbhub.server.domain.api.param.DataSourcePageQueryParam;
import com.alibaba.dbhub.server.domain.api.param.DataSourcePreConnectParam;
import com.alibaba.dbhub.server.domain.api.param.DataSourceUpdateParam;
import com.alibaba.dbhub.server.domain.support.model.Database;
import com.alibaba.dbhub.server.domain.support.model.KeyValue;
import com.alibaba.dbhub.server.web.api.controller.data.source.request.ConsoleCloseRequest;
import com.alibaba.dbhub.server.web.api.controller.data.source.request.ConsoleConnectRequest;
import com.alibaba.dbhub.server.web.api.controller.data.source.request.DataSourceCreateRequest;
import com.alibaba.dbhub.server.web.api.controller.data.source.request.DataSourceQueryRequest;
import com.alibaba.dbhub.server.web.api.controller.data.source.request.DataSourceTestRequest;
import com.alibaba.dbhub.server.web.api.controller.data.source.request.DataSourceUpdateRequest;
import com.alibaba.dbhub.server.web.api.controller.data.source.vo.DataSourceVO;
import com.alibaba.dbhub.server.web.api.controller.data.source.vo.DatabaseVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T10:48:15+0800",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class DataSourceWebConverterImpl extends DataSourceWebConverter {

    @Override
    public DataSourceCreateParam createReq2param(DataSourceCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        DataSourceCreateParam dataSourceCreateParam = new DataSourceCreateParam();

        dataSourceCreateParam.setUserName( request.getUser() );
        dataSourceCreateParam.setAlias( request.getAlias() );
        dataSourceCreateParam.setDriver( request.getDriver() );
        dataSourceCreateParam.setEnvType( request.getEnvType() );
        List<KeyValue> list = request.getExtendInfo();
        if ( list != null ) {
            dataSourceCreateParam.setExtendInfo( new ArrayList<KeyValue>( list ) );
        }
        dataSourceCreateParam.setHost( request.getHost() );
        dataSourceCreateParam.setJdbc( request.getJdbc() );
        dataSourceCreateParam.setPassword( request.getPassword() );
        dataSourceCreateParam.setPort( request.getPort() );
        dataSourceCreateParam.setSid( request.getSid() );
        dataSourceCreateParam.setSsh( request.getSsh() );
        dataSourceCreateParam.setSsl( request.getSsl() );
        dataSourceCreateParam.setType( request.getType() );
        dataSourceCreateParam.setUrl( request.getUrl() );

        return dataSourceCreateParam;
    }

    @Override
    public DataSourceUpdateParam updateReq2param(DataSourceUpdateRequest request) {
        if ( request == null ) {
            return null;
        }

        DataSourceUpdateParam dataSourceUpdateParam = new DataSourceUpdateParam();

        dataSourceUpdateParam.setUserName( request.getUser() );
        dataSourceUpdateParam.setAlias( request.getAlias() );
        dataSourceUpdateParam.setDriver( request.getDriver() );
        dataSourceUpdateParam.setEnvType( request.getEnvType() );
        List<KeyValue> list = request.getExtendInfo();
        if ( list != null ) {
            dataSourceUpdateParam.setExtendInfo( new ArrayList<KeyValue>( list ) );
        }
        dataSourceUpdateParam.setHost( request.getHost() );
        dataSourceUpdateParam.setId( request.getId() );
        dataSourceUpdateParam.setJdbc( request.getJdbc() );
        dataSourceUpdateParam.setPassword( request.getPassword() );
        dataSourceUpdateParam.setPort( request.getPort() );
        dataSourceUpdateParam.setSid( request.getSid() );
        dataSourceUpdateParam.setSsh( request.getSsh() );
        dataSourceUpdateParam.setSsl( request.getSsl() );
        dataSourceUpdateParam.setType( request.getType() );
        dataSourceUpdateParam.setUrl( request.getUrl() );

        return dataSourceUpdateParam;
    }

    @Override
    public DataSourcePageQueryParam queryReq2param(DataSourceQueryRequest request) {
        if ( request == null ) {
            return null;
        }

        DataSourcePageQueryParam dataSourcePageQueryParam = new DataSourcePageQueryParam();

        dataSourcePageQueryParam.setPageNo( request.getPageNo() );
        dataSourcePageQueryParam.setPageSize( request.getPageSize() );
        dataSourcePageQueryParam.setSearchKey( request.getSearchKey() );

        return dataSourcePageQueryParam;
    }

    @Override
    public DataSourceVO dto2vo(DataSource dataSource) {
        if ( dataSource == null ) {
            return null;
        }

        DataSourceVO dataSourceVO = new DataSourceVO();

        dataSourceVO.setUser( dataSource.getUserName() );
        dataSourceVO.setAlias( dataSource.getAlias() );
        dataSourceVO.setDriver( dataSource.getDriver() );
        dataSourceVO.setEnvType( dataSource.getEnvType() );
        List<KeyValue> list = dataSource.getExtendInfo();
        if ( list != null ) {
            dataSourceVO.setExtendInfo( new ArrayList<KeyValue>( list ) );
        }
        dataSourceVO.setHost( dataSource.getHost() );
        dataSourceVO.setId( dataSource.getId() );
        dataSourceVO.setJdbc( dataSource.getJdbc() );
        dataSourceVO.setPort( dataSource.getPort() );
        dataSourceVO.setSid( dataSource.getSid() );
        dataSourceVO.setSsh( dataSource.getSsh() );
        dataSourceVO.setSsl( dataSource.getSsl() );
        dataSourceVO.setType( dataSource.getType() );
        dataSourceVO.setUrl( dataSource.getUrl() );

        return dataSourceVO;
    }

    @Override
    public List<DataSourceVO> dto2vo(List<DataSource> dataSources) {
        if ( dataSources == null ) {
            return null;
        }

        List<DataSourceVO> list = new ArrayList<DataSourceVO>( dataSources.size() );
        for ( DataSource dataSource : dataSources ) {
            list.add( dto2vo( dataSource ) );
        }

        return list;
    }

    @Override
    public DatabaseVO databaseDto2vo(Database databaseDTO) {
        if ( databaseDTO == null ) {
            return null;
        }

        DatabaseVO databaseVO = new DatabaseVO();

        databaseVO.setName( databaseDTO.getName() );

        return databaseVO;
    }

    @Override
    public List<DatabaseVO> databaseDto2vo(List<Database> databaseDTOS) {
        if ( databaseDTOS == null ) {
            return null;
        }

        List<DatabaseVO> list = new ArrayList<DatabaseVO>( databaseDTOS.size() );
        for ( Database database : databaseDTOS ) {
            list.add( databaseDto2vo( database ) );
        }

        return list;
    }

    @Override
    public DataSourcePreConnectParam testRequest2param(DataSourceTestRequest request) {
        if ( request == null ) {
            return null;
        }

        DataSourcePreConnectParam dataSourcePreConnectParam = new DataSourcePreConnectParam();

        dataSourcePreConnectParam.setAlias( request.getAlias() );
        dataSourcePreConnectParam.setDriver( request.getDriver() );
        List<KeyValue> list = request.getExtendInfo();
        if ( list != null ) {
            dataSourcePreConnectParam.setExtendInfo( new ArrayList<KeyValue>( list ) );
        }
        dataSourcePreConnectParam.setHost( request.getHost() );
        dataSourcePreConnectParam.setJdbc( request.getJdbc() );
        dataSourcePreConnectParam.setPassword( request.getPassword() );
        dataSourcePreConnectParam.setPort( request.getPort() );
        dataSourcePreConnectParam.setSid( request.getSid() );
        dataSourcePreConnectParam.setSsh( request.getSsh() );
        dataSourcePreConnectParam.setSsl( request.getSsl() );
        dataSourcePreConnectParam.setType( request.getType() );
        dataSourcePreConnectParam.setUrl( request.getUrl() );
        dataSourcePreConnectParam.setUser( request.getUser() );

        return dataSourcePreConnectParam;
    }

    @Override
    public ConsoleConnectParam request2connectParam(ConsoleConnectRequest request) {
        if ( request == null ) {
            return null;
        }

        ConsoleConnectParam consoleConnectParam = new ConsoleConnectParam();

        consoleConnectParam.setConsoleId( request.getConsoleId() );
        consoleConnectParam.setDataSourceId( request.getDataSourceId() );
        consoleConnectParam.setDatabaseName( request.getDatabaseName() );

        return consoleConnectParam;
    }

    @Override
    public ConsoleCloseParam request2closeParam(ConsoleCloseRequest request) {
        if ( request == null ) {
            return null;
        }

        ConsoleCloseParam consoleCloseParam = new ConsoleCloseParam();

        consoleCloseParam.setConsoleId( request.getConsoleId() );
        consoleCloseParam.setDataSourceId( request.getDataSourceId() );

        return consoleCloseParam;
    }
}
