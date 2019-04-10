package com.uabc.database.example.examplejpa.jpa.services;

import com.uabc.database.example.examplejpa.jpa.entity.Log;
import com.uabc.database.example.examplejpa.jpa.model.LogModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("logService")
public interface LogService {
    public abstract LogModel addLog(LogModel logModel) throws Exception;

    public abstract List<LogModel> listAllLogs();

    public abstract Log findLogById(int id);

    public abstract void removeLog(int id);

    public abstract LogModel findLogByIdModel(int id);
}
