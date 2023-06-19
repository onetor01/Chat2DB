package com.alibaba.dbhub.server.web.api.controller.rdb.converter;

import com.alibaba.dbhub.server.domain.api.param.DlExecuteParam;
import com.alibaba.dbhub.server.domain.api.param.DropParam;
import com.alibaba.dbhub.server.domain.api.param.ShowCreateTableParam;
import com.alibaba.dbhub.server.domain.api.param.TablePageQueryParam;
import com.alibaba.dbhub.server.domain.api.param.TableQueryParam;
import com.alibaba.dbhub.server.domain.support.model.Cell;
import com.alibaba.dbhub.server.domain.support.model.ExecuteResult;
import com.alibaba.dbhub.server.domain.support.model.Schema;
import com.alibaba.dbhub.server.domain.support.model.Sql;
import com.alibaba.dbhub.server.domain.support.model.Table;
import com.alibaba.dbhub.server.domain.support.model.TableColumn;
import com.alibaba.dbhub.server.domain.support.model.TableIndex;
import com.alibaba.dbhub.server.domain.support.model.TableIndexColumn;
import com.alibaba.dbhub.server.web.api.controller.rdb.request.ColumnRequest;
import com.alibaba.dbhub.server.web.api.controller.rdb.request.DdlExportRequest;
import com.alibaba.dbhub.server.web.api.controller.rdb.request.DdlRequest;
import com.alibaba.dbhub.server.web.api.controller.rdb.request.DmlRequest;
import com.alibaba.dbhub.server.web.api.controller.rdb.request.IndexRequest;
import com.alibaba.dbhub.server.web.api.controller.rdb.request.TableBriefQueryRequest;
import com.alibaba.dbhub.server.web.api.controller.rdb.request.TableDeleteRequest;
import com.alibaba.dbhub.server.web.api.controller.rdb.request.TableDetailQueryRequest;
import com.alibaba.dbhub.server.web.api.controller.rdb.request.TableRequest;
import com.alibaba.dbhub.server.web.api.controller.rdb.vo.CellVO;
import com.alibaba.dbhub.server.web.api.controller.rdb.vo.ColumnVO;
import com.alibaba.dbhub.server.web.api.controller.rdb.vo.ExecuteResultVO;
import com.alibaba.dbhub.server.web.api.controller.rdb.vo.IndexVO;
import com.alibaba.dbhub.server.web.api.controller.rdb.vo.SchemaVO;
import com.alibaba.dbhub.server.web.api.controller.rdb.vo.SqlVO;
import com.alibaba.dbhub.server.web.api.controller.rdb.vo.TableVO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-19T10:48:15+0800",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.34.0.v20230511-1142, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class RdbWebConverterImpl extends RdbWebConverter {

    @Override
    public DlExecuteParam request2param(DmlRequest request) {
        if ( request == null ) {
            return null;
        }

        DlExecuteParam dlExecuteParam = new DlExecuteParam();

        dlExecuteParam.setConsoleId( request.getConsoleId() );
        dlExecuteParam.setDataSourceId( request.getDataSourceId() );
        dlExecuteParam.setDatabaseName( request.getDatabaseName() );
        dlExecuteParam.setSql( request.getSql() );

        return dlExecuteParam;
    }

    @Override
    public DlExecuteParam tableManageRequest2param(DdlRequest request) {
        if ( request == null ) {
            return null;
        }

        DlExecuteParam dlExecuteParam = new DlExecuteParam();

        dlExecuteParam.setConsoleId( request.getConsoleId() );
        dlExecuteParam.setDataSourceId( request.getDataSourceId() );
        dlExecuteParam.setDatabaseName( request.getDatabaseName() );
        dlExecuteParam.setSql( request.getSql() );

        return dlExecuteParam;
    }

    @Override
    public TableQueryParam tableRequest2param(TableDetailQueryRequest request) {
        if ( request == null ) {
            return null;
        }

        TableQueryParam tableQueryParam = new TableQueryParam();

        tableQueryParam.setDataSourceId( request.getDataSourceId() );
        tableQueryParam.setDatabaseName( request.getDatabaseName() );
        tableQueryParam.setSchemaName( request.getSchemaName() );
        tableQueryParam.setTableName( request.getTableName() );

        return tableQueryParam;
    }

    @Override
    public Table tableRequest2param(TableRequest request) {
        if ( request == null ) {
            return null;
        }

        Table table = new Table();

        table.setColumnList( columnRequestListToTableColumnList( request.getColumnList() ) );
        table.setComment( request.getComment() );
        table.setIndexList( indexRequestListToTableIndexList( request.getIndexList() ) );
        table.setName( request.getName() );

        return table;
    }

    @Override
    public SqlVO dto2vo(Sql dto) {
        if ( dto == null ) {
            return null;
        }

        SqlVO sqlVO = new SqlVO();

        sqlVO.setSql( dto.getSql() );

        return sqlVO;
    }

    @Override
    public TablePageQueryParam tablePageRequest2param(TableBriefQueryRequest request) {
        if ( request == null ) {
            return null;
        }

        TablePageQueryParam tablePageQueryParam = new TablePageQueryParam();

        tablePageQueryParam.setPageNo( request.getPageNo() );
        tablePageQueryParam.setPageSize( request.getPageSize() );
        tablePageQueryParam.setDataSourceId( request.getDataSourceId() );
        tablePageQueryParam.setDatabaseName( request.getDatabaseName() );
        tablePageQueryParam.setSchemaName( request.getSchemaName() );

        return tablePageQueryParam;
    }

    @Override
    public ShowCreateTableParam ddlExport2showCreate(DdlExportRequest request) {
        if ( request == null ) {
            return null;
        }

        ShowCreateTableParam showCreateTableParam = new ShowCreateTableParam();

        showCreateTableParam.setDataSourceId( request.getDataSourceId() );
        showCreateTableParam.setDatabaseName( request.getDatabaseName() );
        showCreateTableParam.setSchemaName( request.getSchemaName() );
        showCreateTableParam.setTableName( request.getTableName() );

        return showCreateTableParam;
    }

    @Override
    public DropParam tableDelete2dropParam(TableDeleteRequest request) {
        if ( request == null ) {
            return null;
        }

        DropParam dropParam = new DropParam();

        dropParam.setDataSourceId( request.getDataSourceId() );
        dropParam.setDatabaseName( request.getDatabaseName() );
        dropParam.setTableName( request.getTableName() );

        return dropParam;
    }

    @Override
    public CellVO cellDto2vo(Cell cell) {
        if ( cell == null ) {
            return null;
        }

        CellVO cellVO = new CellVO();

        cellVO.setBigDecimalValue( cell.getBigDecimalValue() );
        byte[] byteValue = cell.getByteValue();
        if ( byteValue != null ) {
            cellVO.setByteValue( Arrays.copyOf( byteValue, byteValue.length ) );
        }
        cellVO.setDateValue( cell.getDateValue() );
        cellVO.setStringValue( cell.getStringValue() );
        cellVO.setType( cell.getType() );

        return cellVO;
    }

    @Override
    public List<CellVO> cellDto2vo(List<Cell> cells) {
        if ( cells == null ) {
            return null;
        }

        List<CellVO> list = new ArrayList<CellVO>( cells.size() );
        for ( Cell cell : cells ) {
            list.add( cellDto2vo( cell ) );
        }

        return list;
    }

    @Override
    public ExecuteResultVO dto2vo(ExecuteResult dto) {
        if ( dto == null ) {
            return null;
        }

        ExecuteResultVO executeResultVO = new ExecuteResultVO();

        executeResultVO.setDataList( listListToListList( dto.getDataList() ) );
        executeResultVO.setDescription( dto.getDescription() );
        executeResultVO.setHeaderList( cellDto2vo( dto.getHeaderList() ) );
        executeResultVO.setMessage( dto.getMessage() );
        executeResultVO.setSql( dto.getSql() );
        executeResultVO.setSuccess( dto.getSuccess() );

        return executeResultVO;
    }

    @Override
    public List<ExecuteResultVO> dto2vo(List<ExecuteResult> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ExecuteResultVO> list = new ArrayList<ExecuteResultVO>( dtos.size() );
        for ( ExecuteResult executeResult : dtos ) {
            list.add( dto2vo( executeResult ) );
        }

        return list;
    }

    @Override
    public ColumnVO columnDto2vo(TableColumn dto) {
        if ( dto == null ) {
            return null;
        }

        ColumnVO columnVO = new ColumnVO();

        columnVO.setAutoIncrement( dto.getAutoIncrement() );
        columnVO.setColumnType( dto.getColumnType() );
        columnVO.setComment( dto.getComment() );
        if ( dto.getDataType() != null ) {
            columnVO.setDataType( String.valueOf( dto.getDataType() ) );
        }
        columnVO.setDefaultValue( dto.getDefaultValue() );
        columnVO.setName( dto.getName() );
        columnVO.setNullable( dto.getNullable() );
        columnVO.setPrimaryKey( dto.getPrimaryKey() );

        return columnVO;
    }

    @Override
    public List<ColumnVO> columnDto2vo(List<TableColumn> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ColumnVO> list = new ArrayList<ColumnVO>( dtos.size() );
        for ( TableColumn tableColumn : dtos ) {
            list.add( columnDto2vo( tableColumn ) );
        }

        return list;
    }

    @Override
    public IndexVO indexDto2vo(TableIndex dto) {
        if ( dto == null ) {
            return null;
        }

        IndexVO indexVO = new IndexVO();

        indexVO.setColumnList( tableIndexColumnListToColumnVOList( dto.getColumnList() ) );
        indexVO.setComment( dto.getComment() );
        indexVO.setName( dto.getName() );
        indexVO.setType( dto.getType() );

        return indexVO;
    }

    @Override
    public List<IndexVO> indexDto2vo(List<TableIndex> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<IndexVO> list = new ArrayList<IndexVO>( dtos.size() );
        for ( TableIndex tableIndex : dtos ) {
            list.add( indexDto2vo( tableIndex ) );
        }

        return list;
    }

    @Override
    public TableVO tableDto2vo(Table dto) {
        if ( dto == null ) {
            return null;
        }

        TableVO tableVO = new TableVO();

        tableVO.setColumnList( columnDto2vo( dto.getColumnList() ) );
        tableVO.setIndexList( indexDto2vo( dto.getIndexList() ) );
        tableVO.setComment( dto.getComment() );
        tableVO.setName( dto.getName() );

        return tableVO;
    }

    @Override
    public List<TableVO> tableDto2vo(List<Table> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<TableVO> list = new ArrayList<TableVO>( dtos.size() );
        for ( Table table : dtos ) {
            list.add( tableDto2vo( table ) );
        }

        return list;
    }

    @Override
    public List<SchemaVO> schemaDto2vo(List<Schema> tableColumns) {
        if ( tableColumns == null ) {
            return null;
        }

        List<SchemaVO> list = new ArrayList<SchemaVO>( tableColumns.size() );
        for ( Schema schema : tableColumns ) {
            list.add( schemaDto2vo( schema ) );
        }

        return list;
    }

    @Override
    public SchemaVO schemaDto2vo(Schema dto) {
        if ( dto == null ) {
            return null;
        }

        SchemaVO schemaVO = new SchemaVO();

        schemaVO.setName( dto.getName() );

        return schemaVO;
    }

    protected TableColumn columnRequestToTableColumn(ColumnRequest columnRequest) {
        if ( columnRequest == null ) {
            return null;
        }

        TableColumn tableColumn = new TableColumn();

        tableColumn.setAutoIncrement( columnRequest.getAutoIncrement() );
        tableColumn.setColumnType( columnRequest.getColumnType() );
        tableColumn.setComment( columnRequest.getComment() );
        tableColumn.setDefaultValue( columnRequest.getDefaultValue() );
        tableColumn.setName( columnRequest.getName() );
        tableColumn.setNullable( columnRequest.getNullable() );
        tableColumn.setOldName( columnRequest.getOldName() );
        tableColumn.setPrimaryKey( columnRequest.getPrimaryKey() );

        return tableColumn;
    }

    protected List<TableColumn> columnRequestListToTableColumnList(List<ColumnRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<TableColumn> list1 = new ArrayList<TableColumn>( list.size() );
        for ( ColumnRequest columnRequest : list ) {
            list1.add( columnRequestToTableColumn( columnRequest ) );
        }

        return list1;
    }

    protected TableIndexColumn columnVOToTableIndexColumn(ColumnVO columnVO) {
        if ( columnVO == null ) {
            return null;
        }

        TableIndexColumn tableIndexColumn = new TableIndexColumn();

        tableIndexColumn.setComment( columnVO.getComment() );

        return tableIndexColumn;
    }

    protected List<TableIndexColumn> columnVOListToTableIndexColumnList(List<ColumnVO> list) {
        if ( list == null ) {
            return null;
        }

        List<TableIndexColumn> list1 = new ArrayList<TableIndexColumn>( list.size() );
        for ( ColumnVO columnVO : list ) {
            list1.add( columnVOToTableIndexColumn( columnVO ) );
        }

        return list1;
    }

    protected TableIndex indexRequestToTableIndex(IndexRequest indexRequest) {
        if ( indexRequest == null ) {
            return null;
        }

        TableIndex tableIndex = new TableIndex();

        tableIndex.setColumnList( columnVOListToTableIndexColumnList( indexRequest.getColumnList() ) );
        tableIndex.setComment( indexRequest.getComment() );
        tableIndex.setName( indexRequest.getName() );
        tableIndex.setType( indexRequest.getType() );

        return tableIndex;
    }

    protected List<TableIndex> indexRequestListToTableIndexList(List<IndexRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<TableIndex> list1 = new ArrayList<TableIndex>( list.size() );
        for ( IndexRequest indexRequest : list ) {
            list1.add( indexRequestToTableIndex( indexRequest ) );
        }

        return list1;
    }

    protected List<List<CellVO>> listListToListList(List<List<Cell>> list) {
        if ( list == null ) {
            return null;
        }

        List<List<CellVO>> list2 = new ArrayList<List<CellVO>>( list.size() );
        for ( List<Cell> list1 : list ) {
            list2.add( cellDto2vo( list1 ) );
        }

        return list2;
    }

    protected ColumnVO tableIndexColumnToColumnVO(TableIndexColumn tableIndexColumn) {
        if ( tableIndexColumn == null ) {
            return null;
        }

        ColumnVO columnVO = new ColumnVO();

        columnVO.setComment( tableIndexColumn.getComment() );

        return columnVO;
    }

    protected List<ColumnVO> tableIndexColumnListToColumnVOList(List<TableIndexColumn> list) {
        if ( list == null ) {
            return null;
        }

        List<ColumnVO> list1 = new ArrayList<ColumnVO>( list.size() );
        for ( TableIndexColumn tableIndexColumn : list ) {
            list1.add( tableIndexColumnToColumnVO( tableIndexColumn ) );
        }

        return list1;
    }
}
