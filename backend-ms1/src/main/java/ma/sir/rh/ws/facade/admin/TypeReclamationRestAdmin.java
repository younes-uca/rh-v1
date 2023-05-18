package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.TypeReclamation;
import ma.sir.rh.bean.history.TypeReclamationHistory;
import ma.sir.rh.dao.criteria.core.TypeReclamationCriteria;
import ma.sir.rh.dao.criteria.history.TypeReclamationHistoryCriteria;
import ma.sir.rh.service.facade.admin.TypeReclamationAdminService;
import ma.sir.rh.ws.converter.TypeReclamationConverter;
import ma.sir.rh.ws.dto.TypeReclamationDto;
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

@Api("Manages typeReclamation services")
@RestController
@RequestMapping("/api/admin/typeReclamation/")
public class TypeReclamationRestAdmin  extends AbstractController<TypeReclamation, TypeReclamationDto, TypeReclamationHistory, TypeReclamationCriteria, TypeReclamationHistoryCriteria, TypeReclamationAdminService, TypeReclamationConverter> {


    @ApiOperation("upload one typeReclamation")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple typeReclamations")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeReclamations")
    @GetMapping("")
    public ResponseEntity<List<TypeReclamationDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeReclamations")
    @GetMapping("optimized")
    public ResponseEntity<List<TypeReclamationDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeReclamation by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeReclamationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeReclamation")
    @PostMapping("")
    public ResponseEntity<TypeReclamationDto> save(@RequestBody TypeReclamationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeReclamation")
    @PutMapping("")
    public ResponseEntity<TypeReclamationDto> update(@RequestBody TypeReclamationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeReclamation")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeReclamationDto>> delete(@RequestBody List<TypeReclamationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeReclamation")
    @DeleteMapping("")
    public ResponseEntity<TypeReclamationDto> delete(@RequestBody TypeReclamationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeReclamation")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeReclamations by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeReclamations by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeReclamationDto>> findByCriteria(@RequestBody TypeReclamationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeReclamations by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeReclamationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeReclamations by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeReclamationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeReclamation data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeReclamationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeReclamation history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeReclamation paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeReclamationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeReclamation history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeReclamationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeReclamation history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeReclamationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeReclamationRestAdmin (TypeReclamationAdminService service, TypeReclamationConverter converter) {
        super(service, converter);
    }


}