package com.tv189.service.impl;

import com.tv189.dao.IAccountDao;
import com.tv189.domain.Account;
import com.tv189.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl  implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
//
//    public void setAccountDao(IAccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAllById(Integer accountId) {
        return accountDao.findAllById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
