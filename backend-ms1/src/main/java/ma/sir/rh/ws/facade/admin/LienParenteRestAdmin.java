package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.LienParente;
import ma.sir.rh.bean.history.LienParenteHistory;
import ma.sir.rh.dao.criteria.core.LienParenteCriteria;
import ma.sir.rh.dao.criteria.history.LienParenteHistoryCriteria;
import ma.sir.rh.service.facade.admin.LienParenteAdminService;
import ma.sir.rh.ws.converter.LienParenteConverter;
import ma.sir.rh.ws.dto.LienParenteDto;
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

@Api("Manages lienParente services")
@RestController
@RequestMapping("/api/admin/lienParente/")
public class LienParenteRestAdmin  extends AbstractController<LienParente, LienParenteDto, LienParenteHistory, LienParenteCriteria, LienParenteHistoryCriteria, LienParenteAdminService, LienParenteConverter> {


    @ApiOperation("upload one lienParente")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple lienParentes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all lienParentes")
    @GetMapping("")
    public ResponseEntity<List<LienParenteDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all lienParentes")
    @GetMapping("optimized")
    public ResponseEntity<List<LienParenteDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a lienParente by id")
    @GetMapping("id/{id}")
    public ResponseEntity<LienParenteDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  lienParente")
    @PostMapping("")
    public ResponseEntity<LienParenteDto> save(@RequestBody LienParenteDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  lienParente")
    @PutMapping("")
    public ResponseEntity<LienParenteDto> update(@RequestBody LienParenteDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of lienParente")
    @PostMapping("multiple")
    public ResponseEntity<List<LienParenteDto>> delete(@RequestBody List<LienParenteDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified lienParente")
    @DeleteMapping("")
    public ResponseEntity<LienParenteDto> delete(@RequestBody LienParenteDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified lienParente")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple lienParentes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds lienParentes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<LienParenteDto>> findByCriteria(@RequestBody LienParenteCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated lienParentes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LienParenteCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports lienParentes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody LienParenteCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets lienParente data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody LienParenteCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets lienParente history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets lienParente paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LienParenteHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports lienParente history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LienParenteHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets lienParente history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LienParenteHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LienParenteRestAdmin (LienParenteAdminService service, LienParenteConverter converter) {
        super(service, converter);
    }


}