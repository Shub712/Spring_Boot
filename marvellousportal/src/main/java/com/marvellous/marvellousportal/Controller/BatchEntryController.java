package com.marvellous.marvellousportal.Controller;

import com.marvellous.marvellousportal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    private Map <Long,BatchEntry> batchentries = new HashMap<>();

    // select * from batches
    @GetMapping
    public List<BatchEntry> getAll()
    {
        return new ArrayList<>(batchentries.values());
    }

    // select * from batches where id = 3;
    @GetMapping("/id/{myid}")
    public BatchEntry getBatchEntryById(@PathVariable Long myid)
    {
        return batchentries.get(myid);
    }

    // insert into bathces(1,'PPA', 27000)
    @PostMapping
    public String CreateEntry(@RequestBody BatchEntry myentry)
    {
        batchentries.put(myentry.getId(),myentry);
        return "Data Inserted Successfully";
    }

    // delete from batches where id =2;
    @DeleteMapping("/id/{myid}")
    public BatchEntry DeleteEntryById(@PathVariable Long myid)
    {
        return batchentries.remove(myid);
    }

    // update batches set fees = 29000 where id = 2;
    @PutMapping("/id/{myid}")
    public BatchEntry UpdateEntryById(@PathVariable Long myid, @RequestBody  BatchEntry myentry)
    {
        return batchentries.put(myentry.getId(),myentry);
    }
}
