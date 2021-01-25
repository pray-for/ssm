package cn.zjw.service.impl;

import cn.zjw.dao.AccountDao;
import cn.zjw.domain.Account;
import cn.zjw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存所有账户。。。");
        accountDao.saveAccount(account);
    }
}
