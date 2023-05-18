package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.TypeDemandeConge;
import ma.sir.rh.bean.history.TypeDemandeCongeHistory;
import ma.sir.rh.dao.criteria.core.TypeDemandeCongeCriteria;
import ma.sir.rh.dao.criteria.history.TypeDemandeCongeHistoryCriteria;
import ma.sir.rh.service.facade.admin.TypeDemandeCongeAdminService;
import ma.sir.rh.ws.converter.TypeDemandeCongeConverter;
import ma.sir.rh.ws.dto.TypeDemandeCongeDto;
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

@Api("Manages typeDemandeConge services")
@RestController
@RequestMapping("/api/admin/typeDemandeConge/")
public class TypeDemandeCongeRestAdmin  extends AbstractController<TypeDemandeConge, TypeDemandeCongeDto, TypeDemandeCongeHistory, TypeDemandeCongeCriteria, TypeDemandeCongeHistoryCriteria, TypeDemandeCongeAdminService, TypeDemandeCongeConverter> {


    @ApiOperation("upload one typeDemandeConge")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple typeDemandeConges")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeDemandeConges")
    @GetMapping("")
    public ResponseEntity<List<TypeDemandeCongeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeDemandeConges")
    @GetMapping("optimized")
    public ResponseEntity<List<TypeDemandeCongeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeDemandeConge by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeDemandeCongeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeDemandeConge")
    @PostMapping("")
    public ResponseEntity<TypeDemandeCongeDto> save(@RequestBody TypeDemandeCongeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeDemandeConge")
    @PutMapping("")
    public ResponseEntity<TypeDemandeCongeDto> update(@RequestBody TypeDemandeCongeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeDemandeConge")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeDemandeCongeDto>> delete(@RequestBody List<TypeDemandeCongeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeDemandeConge")
    @DeleteMapping("")
    public ResponseEntity<TypeDemandeCongeDto> delete(@RequestBody TypeDemandeCongeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeDemandeConge")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeDemandeConges by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeDemandeConges by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeDemandeCongeDto>> findByCriteria(@RequestBody TypeDemandeCongeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeDemandeConges by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeDemandeCongeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeDemandeConges by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeDemandeCongeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeDemandeConge data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeDemandeCongeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeDemandeConge history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeDemandeConge paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeDemandeCongeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeDemandeConge history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeDemandeCongeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeDemandeConge history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeDemandeCongeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeDemandeCongeRestAdmin (TypeDemandeCongeAdminService service, TypeDemandeCongeConverter converter) {
        super(service, converter);
    }


}