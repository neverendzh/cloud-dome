package com.neverend.account.service.impl;

import com.neverend.account.dao.ApiAccountDAO;
import com.neverend.account.entity.ApiAccount;
import com.neverend.account.entity.ApiAccountExample;
import com.neverend.account.service.AccountService;
import com.neverend.commons.entity.CommonResult;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private ApiAccountDAO apiAccountDAO;
    /**
     * @param userId 用户id
     * @param money  消费金额
     * @return
     */
    @Override
    public CommonResult decrease(Long userId, BigDecimal money) {
        ApiAccountExample apiAccountExample = new ApiAccountExample();
        ApiAccountExample.Criteria criteria = apiAccountExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<ApiAccount> apiAccounts = apiAccountDAO.selectByExample(apiAccountExample);
        ApiAccount apiAccount = apiAccounts.get(0);
        apiAccount.setResidue(apiAccount.getResidue().subtract(money));
        apiAccount.setUsed(apiAccount.getUsed().add(money));
        apiAccountDAO.updateByPrimaryKeySelective(apiAccount);
        return new CommonResult(200,"扣除用户余额成功");
    }
}
