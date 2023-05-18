package  ma.sir.rh.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.rh.bean.core.Education;
import ma.sir.rh.bean.history.EducationHistory;
import ma.sir.rh.dao.criteria.core.EducationCriteria;
import ma.sir.rh.dao.criteria.history.EducationHistoryCriteria;
import ma.sir.rh.service.facade.admin.EducationAdminService;
import ma.sir.rh.ws.converter.EducationConverter;
import ma.sir.rh.ws.dto.EducationDto;
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

@Api("Manages education services")
@RestController
@RequestMapping("/api/admin/education/")
public class EducationRestAdmin  extends AbstractController<Education, EducationDto, EducationHistory, EducationCriteria, EducationHistoryCriteria, EducationAdminService, EducationConverter> {


    @ApiOperation("upload one education")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple educations")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all educations")
    @GetMapping("")
    public ResponseEntity<List<EducationDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all educations")
    @GetMapping("optimized")
    public ResponseEntity<List<EducationDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a education by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EducationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  education")
    @PostMapping("")
    public ResponseEntity<EducationDto> save(@RequestBody EducationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  education")
    @PutMapping("")
    public ResponseEntity<EducationDto> update(@RequestBody EducationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of education")
    @PostMapping("multiple")
    public ResponseEntity<List<EducationDto>> delete(@RequestBody List<EducationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified education")
    @DeleteMapping("")
    public ResponseEntity<EducationDto> delete(@RequestBody EducationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified education")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple educations by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds educations by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EducationDto>> findByCriteria(@RequestBody EducationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated educations by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EducationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports educations by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EducationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets education data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EducationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets education history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets education paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EducationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports education history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EducationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets education history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EducationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EducationRestAdmin (EducationAdminService service, EducationConverter converter) {
        super(service, converter);
    }


}