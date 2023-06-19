package com.alibaba.dbhub.server.web.api.controller.operation.saved.converter;

import com.alibaba.dbhub.server.domain.api.model.Operation;
import com.alibaba.dbhub.server.domain.api.param.OperationPageQueryParam;
import com.alibaba.dbhub.server.domain.api.param.OperationSavedParam;
import com.alibaba.dbhub.server.domain.api.param.OperationUpdateParam;
import com.alibaba.dbhub.server.web.api.controller.operation.saved.request.OperationCreateRequest;
import com.alibaba.dbhub.server.web.api.controller.operation.saved.request.OperationQueryRequest;
import com.alibaba.dbhub.server.web.api.controller.operation.saved.request.OperationUpdateRequest;
import com.alibaba.dbhub.server.web.api.controller.operation.saved.vo.OperationVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T10:48:14+0800",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class OperationWebConverterImpl extends OperationWebConverter {

    @Override
    public OperationSavedParam req2param(OperationCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        OperationSavedParam operationSavedParam = new OperationSavedParam();

        operationSavedParam.setDataSourceId( request.getDataSourceId() );
        operationSavedParam.setDatabaseName( request.getDatabaseName() );
        operationSavedParam.setDdl( request.getDdl() );
        operationSavedParam.setName( request.getName() );
        operationSavedParam.setSchemaName( request.getSchemaName() );
        operationSavedParam.setStatus( request.getStatus() );
        operationSavedParam.setTabOpened( request.getTabOpened() );
        operationSavedParam.setType( request.getType() );

        return operationSavedParam;
    }

    @Override
    public OperationUpdateParam updateReq2param(OperationUpdateRequest request) {
        if ( request == null ) {
            return null;
        }

        OperationUpdateParam operationUpdateParam = new OperationUpdateParam();

        operationUpdateParam.setDdl( request.getDdl() );
        operationUpdateParam.setId( request.getId() );
        operationUpdateParam.setName( request.getName() );
        operationUpdateParam.setStatus( request.getStatus() );
        operationUpdateParam.setTabOpened( request.getTabOpened() );

        return operationUpdateParam;
    }

    @Override
    public OperationPageQueryParam queryReq2param(OperationQueryRequest request) {
        if ( request == null ) {
            return null;
        }

        OperationPageQueryParam operationPageQueryParam = new OperationPageQueryParam();

        operationPageQueryParam.setPageNo( request.getPageNo() );
        operationPageQueryParam.setPageSize( request.getPageSize() );
        operationPageQueryParam.setDataSourceId( request.getDataSourceId() );
        operationPageQueryParam.setDatabaseName( request.getDatabaseName() );
        operationPageQueryParam.setSearchKey( request.getSearchKey() );
        operationPageQueryParam.setStatus( request.getStatus() );
        operationPageQueryParam.setTabOpened( request.getTabOpened() );

        return operationPageQueryParam;
    }

    @Override
    public OperationVO dto2vo(Operation ddlDTO) {
        if ( ddlDTO == null ) {
            return null;
        }

        OperationVO operationVO = new OperationVO();

        operationVO.setDataSourceId( ddlDTO.getDataSourceId() );
        operationVO.setDataSourceName( ddlDTO.getDataSourceName() );
        operationVO.setDatabaseName( ddlDTO.getDatabaseName() );
        operationVO.setDdl( ddlDTO.getDdl() );
        operationVO.setId( ddlDTO.getId() );
        operationVO.setName( ddlDTO.getName() );
        operationVO.setSchemaName( ddlDTO.getSchemaName() );
        operationVO.setStatus( ddlDTO.getStatus() );
        operationVO.setTabOpened( ddlDTO.getTabOpened() );
        operationVO.setType( ddlDTO.getType() );

        operationVO.setConnectable( ddlDTO.getDataSourceName() != null );

        return operationVO;
    }

    @Override
    public List<OperationVO> dto2vo(List<Operation> ddlDTOS) {
        if ( ddlDTOS == null ) {
            return null;
        }

        List<OperationVO> list = new ArrayList<OperationVO>( ddlDTOS.size() );
        for ( Operation operation : ddlDTOS ) {
            list.add( dto2vo( operation ) );
        }

        return list;
    }
}
