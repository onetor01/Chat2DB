package com.alibaba.dbhub.server.domain.core.converter;

import com.alibaba.dbhub.server.domain.api.model.Operation;
import com.alibaba.dbhub.server.domain.api.param.OperationSavedParam;
import com.alibaba.dbhub.server.domain.api.param.OperationUpdateParam;
import com.alibaba.dbhub.server.domain.repository.entity.OperationSavedDO;
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
public class OperationConverterImpl extends OperationConverter {

    @Override
    public OperationSavedDO param2do(OperationSavedParam param) {
        if ( param == null ) {
            return null;
        }

        OperationSavedDO operationSavedDO = new OperationSavedDO();

        operationSavedDO.setDbSchemaName( param.getSchemaName() );
        operationSavedDO.setDataSourceId( param.getDataSourceId() );
        operationSavedDO.setDatabaseName( param.getDatabaseName() );
        operationSavedDO.setDdl( param.getDdl() );
        operationSavedDO.setName( param.getName() );
        operationSavedDO.setStatus( param.getStatus() );
        operationSavedDO.setTabOpened( param.getTabOpened() );
        operationSavedDO.setType( param.getType() );

        return operationSavedDO;
    }

    @Override
    public OperationSavedDO param2do(OperationUpdateParam param) {
        if ( param == null ) {
            return null;
        }

        OperationSavedDO operationSavedDO = new OperationSavedDO();

        operationSavedDO.setDbSchemaName( param.getSchemaName() );
        operationSavedDO.setDataSourceId( param.getDataSourceId() );
        operationSavedDO.setDatabaseName( param.getDatabaseName() );
        operationSavedDO.setDdl( param.getDdl() );
        operationSavedDO.setId( param.getId() );
        operationSavedDO.setName( param.getName() );
        operationSavedDO.setStatus( param.getStatus() );
        operationSavedDO.setTabOpened( param.getTabOpened() );
        operationSavedDO.setType( param.getType() );

        return operationSavedDO;
    }

    @Override
    public Operation do2dto(OperationSavedDO userSavedDdlDO) {
        if ( userSavedDdlDO == null ) {
            return null;
        }

        Operation operation = new Operation();

        operation.setSchemaName( userSavedDdlDO.getDbSchemaName() );
        operation.setDataSourceId( userSavedDdlDO.getDataSourceId() );
        operation.setDatabaseName( userSavedDdlDO.getDatabaseName() );
        operation.setDdl( userSavedDdlDO.getDdl() );
        operation.setGmtCreate( userSavedDdlDO.getGmtCreate() );
        operation.setGmtModified( userSavedDdlDO.getGmtModified() );
        operation.setId( userSavedDdlDO.getId() );
        operation.setName( userSavedDdlDO.getName() );
        operation.setStatus( userSavedDdlDO.getStatus() );
        operation.setTabOpened( userSavedDdlDO.getTabOpened() );
        operation.setType( userSavedDdlDO.getType() );

        return operation;
    }

    @Override
    public List<Operation> do2dto(List<OperationSavedDO> userSavedDdlDOS) {
        if ( userSavedDdlDOS == null ) {
            return null;
        }

        List<Operation> list = new ArrayList<Operation>( userSavedDdlDOS.size() );
        for ( OperationSavedDO operationSavedDO : userSavedDdlDOS ) {
            list.add( do2dto( operationSavedDO ) );
        }

        return list;
    }
}
