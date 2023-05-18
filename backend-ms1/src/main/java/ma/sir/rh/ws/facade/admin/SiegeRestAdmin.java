package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Siege;
import ma.sir.rh.bean.history.SiegeHistory;
import ma.sir.rh.dao.criteria.core.SiegeCriteria;
import ma.sir.rh.dao.criteria.history.SiegeHistoryCriteria;
import ma.sir.rh.service.facade.admin.SiegeAdminService;
import ma.sir.rh.ws.converter.SiegeConverter;
import ma.sir.rh.ws.dto.SiegeDto;
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

@Api("Manages siege services")
@RestController
@RequestMapping("/api/admin/siege/")
public class SiegeRestAdmin  extends AbstractController<Siege, SiegeDto, SiegeHistory, SiegeCriteria, SiegeHistoryCriteria, SiegeAdminService, SiegeConverter> {


    @ApiOperation("upload one siege")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple sieges")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all sieges")
    @GetMapping("")
    public ResponseEntity<List<SiegeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all sieges")
    @GetMapping("optimized")
    public ResponseEntity<List<SiegeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a siege by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SiegeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  siege")
    @PostMapping("")
    public ResponseEntity<SiegeDto> save(@RequestBody SiegeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  siege")
    @PutMapping("")
    public ResponseEntity<SiegeDto> update(@RequestBody SiegeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of siege")
    @PostMapping("multiple")
    public ResponseEntity<List<SiegeDto>> delete(@RequestBody List<SiegeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified siege")
    @DeleteMapping("")
    public ResponseEntity<SiegeDto> delete(@RequestBody SiegeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified siege")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple sieges by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds sieges by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SiegeDto>> findByCriteria(@RequestBody SiegeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated sieges by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SiegeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports sieges by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SiegeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets siege data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SiegeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets siege history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets siege paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SiegeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports siege history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SiegeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets siege history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SiegeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SiegeRestAdmin (SiegeAdminService service, SiegeConverter converter) {
        super(service, converter);
    }


}