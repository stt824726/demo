package com.org.controller.aop;

/**
 * 异常日志内容常量
 */
public final class CofingConstant {
    private CofingConstant() {
    }

    /**
     * token 过期时间
     */
    public static final long TOKEN_DURATION = 60 * 60 * 24 * 1000L;

    /**
     * "设备唯一id"
     */
    public static final String DEVICE_ID = "deviceId";

    public static final String RESOURCE_CONFIG_STATUS_UPDATE_KEY = "resource_config_status_update_key";

    public static final long RESOURCE_CONFIG_STATUS_UPDATE_KEY_DURATION = 60 * 3;

    public static final String USER_NOT_LOGIN = "用户未登录";

    public static final String NO_ACCESS_AUTHORITY = "没有访问权限，请联系系统管理员";

    public static final String DATA_EXCEPTION = "数据异常";

    public static final String BUSINESS_SERVICE_EXCEPTION = "业务异常,请联系服务方";

    public static final String DATA_ACCESS_EXCEPTION = "数据越界，请检查提交信息中的文本长度及金额、数量等";

    public static final String ARGUMENT_TYPE_MISMATCH = "参数格式异常";

    public static final String SOCKET_TIME_OUT = "网络不稳定请稍后再试";

    public static final String SERVICE_NOT_AVAILABLE = "内部服务不可用,请稍后再试";

    public static final String HTTP_MESSAGE_NOT_READABLE = "请求信息不可读";

    public static final String REPEAT_DATA_EXCEPTION = "数据已存在";

    public static final String CALCULATE_EXCEPTION = "计数异常";

    public static final String INNER_TYPE_BUILD_ERROR = "内部类型构建错误";

    public static final String FILE_UPLOAD_FAIL = "文件上传失败";

    public static final String FILE_DATA_NULL = "文件数据为空";

    public static final String FILE_DATA_TOO_LARGE = "文件数据过大";

    public static final String DATA_RESOLVE_ERROR = "数据解析错误";

    public static final String DATE_CONVERTER_ERROR = "日期转换错误:{0}";

    public static final String DOWNLOAD_EXCEL_DATA_EXCEPTION = "excel导出数据异常";

    public static final String SEND_MSG_TOO_MUCH_OR_OUT_OF_SERVICE = "发送短信错误,您不在服务器或者一段时间内发送次数过多";

    public static final String COMPANY_PHONE_ALREADY_REGISTER = "门店手机号已注册";

    public static final String NO_BELONG_COMPANY_INFO = "没有所属公司信息";

    public static final String DATA_NOT_FOUND = "数据不存在!";

    public static final String CAN_NOT_DELETE = "该配件存在库存，不允许删除!";

    public static final String ACC_ALREADY_EXIST = "用户登录名已存在";

    public static final String USER_PHONE_ALREADY_EXIST = "用户手机号已存在";

    public static final String EMPTY_DATA_OF_PHONE = "请输入手机号";

    public static final String V_CODE_ALREADY_SEND = "手机号：{0}已经发送验证码，60s之后重新发";

    public static final String DATA_NULL_EXCEPTION = "数据不存在";

    public static final String BANNER_SORT_NOT_NULL = "请选择banner位置";

    public static final String BANNER_SORT_ALREADY_EXIST = "banner位置已存在，请重新选择";

    public static final String NOTIFY_UPDATE_FAILED = "通知状态不可修改";

    public static final String NOTIFY_DELETE_FAILED = "通知状态不可删除";

    public static final String OLD_NEW_PASSWORDS_CANNOT_BE_THE_SAME = "新旧密码不能相同";

    public static final String PASSWORDS_ERROR = "旧密码不正确";

    public static final String APP_VERSION_TOO_LOW = "您当前使用的APP版本过低，请更新到最新版本后再使用";

    public static final String WECHAT_DECRYPT_ERROR = "微信解密失败";

    public static final String DATA_NULL_EXCEPTION_VCODE = "请输入验证码";

    public static final String VCODE_VALIDATE_ERROR = "验证码验证失败";

    public static final String NOT_ALLOW_DISABLE_SELF = "不能禁用自己的账号";

    public static final String NOT_ALLOW_CHOOSE_DISABLED_MANAGER = "该客户经理已被禁用，请重新选择";

    public static final String GARAGE_ROLE_EXCEED_MAX_COUNT = "岗位不能超过20个";

    public static final String MEM_CARD_ITEM_NOT_DELETE = "该配件已绑定会员卡，无法被删除。";

    public static final String MEM_CARD_TASK_NOT_DELETE = "该工时已绑定会员卡，无法被删除。";

    public static final String RESOURCE_CONFIG_TYPE_NOT_CORRECT = "资源位配置类型不正确";

    public static final String RESOURCE_CONFIG_NOT_COMPLETE = "资源位配置信息不完整";

    public static final String RESOURCE_CONFIG_DATE_NOT_COMPLETE = "资源位配置日期信息不完整";

    public static final String RESOURCE_CONFIG_DATE_NOT_CORRECT = "资源位配置开始日期不能大于结束日期";

    public static final String RESOURCE_CONFIG_SORT_NOT_NULL = "请选择资源位排序";

    public static final String RESOURCE_CONFIG_BANNER_SORT_ALREADY_EXIST = "资源位排序位置已存在，请重新选择";

    public static final String RESOURCE_CONFIG_DISTRICT_ALREADY_EXIST = "存在相同区域，请检查！";
}
