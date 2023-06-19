package com.alibaba.dbhub.server.domain.core.converter;

import com.alibaba.dbhub.server.domain.api.model.OperationLog;
import com.alibaba.dbhub.server.domain.api.param.OperationLogCreateParam;
import com.alibaba.dbhub.server.domain.repository.entity.OperationLogDO;
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
public class OperationLogConverterImpl extends OperationLogConverter {

    @Override
    public OperationLogDO param2do(OperationLogCreateParam param) {
        if ( param == null ) {
            return null;
        }

        OperationLogDO operationLogDO = new OperationLogDO();

        operationLogDO.setDataSourceId( param.getDataSourceId() );
        operationLogDO.setDatabaseName( param.getDatabaseName() );
        operationLogDO.setDdl( param.getDdl() );
        operationLogDO.setId( param.getId() );
        operationLogDO.setType( param.getType() );

        return operationLogDO;
    }

    @Override
    public OperationLog do2dto(OperationLogDO userExecutedDdlDO) {
        if ( userExecutedDdlDO == null ) {
            return null;
        }

        OperationLog operationLog = new OperationLog();

        operationLog.setDataSourceId( userExecutedDdlDO.getDataSourceId() );
        operationLog.setDatabaseName( userExecutedDdlDO.getDatabaseName() );
        operationLog.setDdl( userExecutedDdlDO.getDdl() );
        operationLog.setGmtCreate( userExecutedDdlDO.getGmtCreate() );
        operationLog.setGmtModified( userExecutedDdlDO.getGmtModified() );
        operationLog.setId( userExecutedDdlDO.getId() );
        operationLog.setType( userExecutedDdlDO.getType() );

        return operationLog;
    }

    @Override
    public List<OperationLog> do2dto(List<OperationLogDO> userExecutedDdlDOS) {
        if ( userExecutedDdlDOS == null ) {
            return null;
        }

        List<OperationLog> list = new ArrayList<OperationLog>( userExecutedDdlDOS.size() );
        for ( OperationLogDO operationLogDO : userExecutedDdlDOS ) {
            list.add( do2dto( operationLogDO ) );
        }

        return list;
    }
}
