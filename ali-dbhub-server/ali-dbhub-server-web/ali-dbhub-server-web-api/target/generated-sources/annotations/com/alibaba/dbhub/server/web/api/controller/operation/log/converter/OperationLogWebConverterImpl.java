package com.alibaba.dbhub.server.web.api.controller.operation.log.converter;

import com.alibaba.dbhub.server.domain.api.model.OperationLog;
import com.alibaba.dbhub.server.domain.api.param.OperationLogCreateParam;
import com.alibaba.dbhub.server.domain.api.param.OperationLogPageQueryParam;
import com.alibaba.dbhub.server.web.api.controller.operation.log.request.OperationLogCreateRequest;
import com.alibaba.dbhub.server.web.api.controller.operation.log.request.OperationLogQueryRequest;
import com.alibaba.dbhub.server.web.api.controller.operation.log.vo.OperationLogVO;
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
public class OperationLogWebConverterImpl extends OperationLogWebConverter {

    @Override
    public OperationLogCreateParam createReq2param(OperationLogCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        OperationLogCreateParam operationLogCreateParam = new OperationLogCreateParam();

        operationLogCreateParam.setDataSourceId( request.getDataSourceId() );
        operationLogCreateParam.setDatabaseName( request.getDatabaseName() );
        operationLogCreateParam.setDdl( request.getDdl() );
        operationLogCreateParam.setType( request.getType() );

        return operationLogCreateParam;
    }

    @Override
    public OperationLogPageQueryParam req2param(OperationLogQueryRequest request) {
        if ( request == null ) {
            return null;
        }

        OperationLogPageQueryParam operationLogPageQueryParam = new OperationLogPageQueryParam();

        operationLogPageQueryParam.setPageNo( request.getPageNo() );
        operationLogPageQueryParam.setPageSize( request.getPageSize() );
        operationLogPageQueryParam.setSearchKey( request.getSearchKey() );

        return operationLogPageQueryParam;
    }

    @Override
    public OperationLogVO dto2vo(OperationLog ddlDTO) {
        if ( ddlDTO == null ) {
            return null;
        }

        OperationLogVO operationLogVO = new OperationLogVO();

        operationLogVO.setName( ddlDTO.getDdl() );
        operationLogVO.setDataSourceId( ddlDTO.getDataSourceId() );
        operationLogVO.setDataSourceName( ddlDTO.getDataSourceName() );
        operationLogVO.setDatabaseName( ddlDTO.getDatabaseName() );
        operationLogVO.setId( ddlDTO.getId() );
        operationLogVO.setType( ddlDTO.getType() );

        operationLogVO.setConnectable( ddlDTO.getDataSourceName() != null );

        return operationLogVO;
    }

    @Override
    public List<OperationLogVO> dto2vo(List<OperationLog> ddlDTOS) {
        if ( ddlDTOS == null ) {
            return null;
        }

        List<OperationLogVO> list = new ArrayList<OperationLogVO>( ddlDTOS.size() );
        for ( OperationLog operationLog : ddlDTOS ) {
            list.add( dto2vo( operationLog ) );
        }

        return list;
    }
}
