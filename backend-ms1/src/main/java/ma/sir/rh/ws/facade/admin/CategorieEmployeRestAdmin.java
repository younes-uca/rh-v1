package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.CategorieEmploye;
import ma.sir.rh.bean.history.CategorieEmployeHistory;
import ma.sir.rh.dao.criteria.core.CategorieEmployeCriteria;
import ma.sir.rh.dao.criteria.history.CategorieEmployeHistoryCriteria;
import ma.sir.rh.service.facade.admin.CategorieEmployeAdminService;
import ma.sir.rh.ws.converter.CategorieEmployeConverter;
import ma.sir.rh.ws.dto.CategorieEmployeDto;
import ma.sir.rh.zynerator.controller.AbstractController;
import ma.sir.rh.zynerator.dto.AuditEntityDto;
import ma.sir.rh.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.rh.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.rh.zynerator.dto.FileTempDto;

@Api("Manages categorieEmploye services")
@RestController
@RequestMapping("/api/admin/categorieEmploye/")
public class CategorieEmployeRestAdmin  extends AbstractController<CategorieEmploye, CategorieEmployeDto, CategorieEmployeHistory, CategorieEmployeCriteria, CategorieEmployeHistoryCriteria, CategorieEmployeAdminService, CategorieEmployeConverter> {


    @ApiOperation("upload one categorieEmploye")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple categorieEmployes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all categorieEmployes")
    @GetMapping("")
    public ResponseEntity<List<CategorieEmployeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all categorieEmployes")
    @GetMapping("optimized")
    public ResponseEntity<List<CategorieEmployeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a categorieEmploye by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CategorieEmployeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  categorieEmploye")
    @PostMapping("")
    public ResponseEntity<CategorieEmployeDto> save(@RequestBody CategorieEmployeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  categorieEmploye")
    @PutMapping("")
    public ResponseEntity<CategorieEmployeDto> update(@RequestBody CategorieEmployeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of categorieEmploye")
    @PostMapping("multiple")
    public ResponseEntity<List<CategorieEmployeDto>> delete(@RequestBody List<CategorieEmployeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified categorieEmploye")
    @DeleteMapping("")
    public ResponseEntity<CategorieEmployeDto> delete(@RequestBody CategorieEmployeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified categorieEmploye")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple categorieEmployes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds categorieEmployes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CategorieEmployeDto>> findByCriteria(@RequestBody CategorieEmployeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated categorieEmployes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CategorieEmployeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categorieEmployes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CategorieEmployeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets categorieEmploye data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CategorieEmployeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets categorieEmploye history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets categorieEmploye paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CategorieEmployeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categorieEmploye history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CategorieEmployeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets categorieEmploye history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CategorieEmployeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CategorieEmployeRestAdmin (CategorieEmployeAdminService service, CategorieEmployeConverter converter) {
        super(service, converter);
    }


}