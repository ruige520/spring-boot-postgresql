var contextPath = "/demo";
var utils = {
    /**
     * 是否调试模式
     */
    isDebug: true,
    /**
     * 判断字符串是否为空
     * @param {Object} str
     */
    isEmpty: function (str) {
        if (str == null || str == "") {
            return true;
        }
        return false;
    },
    /**
     * 判断json对象是否为空
     * @param {Object} str
     */
    isEmptyObject: function (obj) {

        for (var key in obj) {
            break;
            return false
        }
        ;
        return true
    },
    /**
     * 判断是否手机号码
     * @param {Object} obj
     */
    isMobileNo: function (obj) {
        //手机号正则表达式
        var regMob = /^1(3|4|5|7|8|9)\d{9}$/;
        if (!regMob.test(obj)) {
            return false;
        }
        return true;
    },
    /**
     * 判断是否身份证号
     * @param {Object} obj
     */
    isIdNo: function (obj) {
        // 身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X
        var regId = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
        if (!regId.test(obj)) {
            return false;
        }
        return true;
    },
    /**
     * 判断是否为合法字符(a-zA-Z0-9-_)
     * @param {Object} obj
     */
    isRightfulString: function (obj) {
        var reg = /^[A-Za-z0-9_-]+$/;
        if (!reg.test(obj)) {
            return false;
        }
        return true;
    },
    /**
     * 判断是否正整数
     * @param {Object} obj
     */
    isDigits: function (obj) {
        var reg = /^\d+$/;
        if (!reg.test(obj)) {
            return false;
        }
        return true;
    },
    /**
     * 判断是否为手机号或固话
     * @param {Object} obj
     */
    isTel: function (obj) {
        var length = obj.length;
        var mobile = /^(((13[0-9]{1})|(15[0-35-9]{1})|(17[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
        var tel = /^(\d{3,4}-?)?\d{7,9}$/g;
        return tel.test(obj) || (length == 11 && mobile.test(obj));
    },
    /**
     * 是否2位小数
     * @param obj
     * @returns {boolean}
     */
    isTwoDecimal: function (obj) {
        // var reg = /^-?\d+\.?\d{0,2}$/;//正负2位小数
        var reg = /^\d+\.?\d{0,2}$/;//正2位小数
        return reg.test(obj);
    },
    /**
     * 判断是否护照号
     * @param {Object} obj
     */
    isPassport: function (obj) {
        //护照验证
        var regPassport = /^[A-Za-z0-9]{5,17}$/;
        if (!regPassport.test(obj)) {
            return false;
        }
        return true;
    },
    /**
     * 控制台输出
     * @param {Object} obj
     */
    myLog: function (obj) {
        if (isDebug) {
            console.log(obj);
        }
    },
    /**
     * 创建自定义键值对象
     */
    createObj: function () {
        var obj = new Object();
        if (arguments.length % 2 != 0) {
            console.error("创建键值对象参数必须为2的倍数!");
            return;
        }
        for (var i = 0; i < arguments.length; i += 2) {
            obj[arguments[i]] = arguments[i + 1];
        }
        return obj;
    },
    /**
     * 获取url传参的类
     */
    getRequest: function () {
        var url = decodeURI(location.search); //获取url中"?"符后的字串
        //var url ="?BOOL=YES&topicId=yydy155331111dyhn&scope=2";
        var theRequest = new Object();
        if (url.indexOf("?") != -1) {
            var str = url.substr(1);
            strs = str.split("&");
            for (var i = 0; i < strs.length; i++) {
                theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
            }
        }
        return theRequest;
    },
    /**
     * 设置cookies
     * @param {Object} name
     * @param {Object} value
     */
    setCookie: function (name, value) {
        var Days = 7;
        var exp = new Date();
        exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
        document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString();
    },
    /**
     * 读取cookies
     * @param {Object} name
     */
    getCookie: function (name) {
        var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
        if (arr = document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    },
    /**
     * 删除cookies
     * @param {Object} name
     */
    delCookie: function (name) {
        var exp = new Date();
        exp.setTime(exp.getTime() - 1);
        var cval = getCookie(name);
        if (cval != null)
            document.cookie = name + "=" + cval + ";expires=" + exp.toGMTString();
    },
    /**
     * 浏览器是否禁用cookies
     */
    cookieEnabled: function () {
        return navigator.cookieEnabled;
    },

    /**
     * ajax请求封装
     */
    ajaxRequest: function (options) {
        this.trimObj(options.data);
        var layerIndex;
        $.ajax({
            type: options.type ? options.type : 'post',
            dataType: 'json',
            contentType: 'application/json; charset=UTF-8',
            url: options.url,
            data: JSON.stringify(options.data),
            beforeSend: function () {
                layerIndex = layer.load()
                if (options.beforeSend) {
                    options.beforeSend()
                }
            },
            // success: options.success,
            success: options.success,
            error: options.error,
            complete: function () {
                if (layerIndex) {
                    layer.close(layerIndex)
                }
                if (options.complete) {
                    options.complete()
                }
            }
        })
    },
    /**
     * 去掉对象属性中字符串前后空格
     * @param obj
     */
    trimObj: function (obj) {
        for (key in obj) {
            if (obj.hasOwnProperty(key) && typeof obj[key] === 'string') {
                obj[key] = $.trim(obj[key]);
            }
        }
    }
}

/**
 * 根据接口是否接通来显示暂无记录
 * @param {Object} obj
 *
 */
function hide(hide) {
    if (hide == 1) {
        $(".f-w-h-100").hide();
    }
    else if (hide == 0) {
        $(".f-w-h-100").show();
    }
}

/*
*需引用qrcode.js文件
*生成二维码的方法
*/
function makeCode(elText) {
    qrcode.makeCode(elText);
};

/*
*获取当前日期
*/
function getNowFormatDate(date) {
    if (!date) {
        date = new Date();
    }
    var seperator1 = "-";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + seperator1 + month + seperator1 + strDate;
    return currentdate;

}

/*
*获取当前日期
*/
function setanyDate(x, i) {
    var date = new Date();
    var seperator1 = "-";
    var year = date.getFullYear();
    var months = date.getMonth() + 1;
    var month = date.getMonth() + 1 + x;
    var strDate = i;
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = strDate;
    }
    if (x < 0) {
        if (month >= months) {
            year--;
        }
    }
    var currentdate = year + seperator1 + month + seperator1 + strDate;
    return currentdate;

}

function setanyDates(x, i) {
    var date = new Date();
    var seperator1 = "-";
    var year = date.getFullYear();
    var months = date.getMonth() + 1;
    var month = date.getMonth() + 1 + x;
    var strDate = date.getDate() + i;
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    if (x < 0) {
        if (month >= months) {
            year--;
        }
    }

    var currentdate = year + seperator1 + month + seperator1 + strDate;
    return currentdate;

}

/**
 * 兼容ie,判断是否str开头
 * @param str
 * @returns {boolean}
 */
String.prototype.startsWith = function (str) {
    if (str == null || str == "" || this.length == 0 || str.length > this.length)
        return false;
    if (this.substr(0, str.length) == str)
        return true;
    else
        return false;
    return true;
}

/**
 * 兼容ie,去除字符串中的空格
 * @returns {string}
 */
String.prototype.trim = function () {
    return this.replace(/(^\s*)|(\s*$)/g, "");
}

/*
*unicode与中文互转
*/

// 转为unicode 编码
function toUni(str) {
    var res = [];
    for (var i = 0; i < str.length; i++) {
        res[i] = ("00" + str.charCodeAt(i).toString(16)).slice(-4);
    }
    return "\\u" + res.join("\\u");
}

// 解码
function tocn(str) {
    str = str.replace(/\\/g, "%");
    return unescape(str);
}

/*
*判断一个字符串中有多少个字母
*/
function getLength(str) {
    if (/[a-z]/i.test(str)) {
        return str.match(/[a-z]/ig).length;
    }
    return 0;
}

/*
*存储cookie
*/
function setCookie(c_name, value, expiredays) {
    var exdate = new Date()
    exdate.setDate(exdate.getDate() + expiredays)
    document.cookie = c_name + "=" + escape(value) +
        ((expiredays == null) ? "" : ";expires=" + exdate.toGMTString())
}

//取回cookie
function getCookie(c_name) {
    if (document.cookie.length > 0) {
        c_start = document.cookie.indexOf(c_name + "=")
        if (c_start != -1) {
            c_start = c_start + c_name.length + 1
            c_end = document.cookie.indexOf(";", c_start)
            if (c_end == -1) c_end = document.cookie.length
            return unescape(document.cookie.substring(c_start, c_end))
        }
    }
    return ""
}

//删除指定的cookie
function deleteCookie(name) {
    var date = new Date();
    date.setTime(date.getTime() - 10000);
    document.cookie = name + "=v; expires=" + date.toGMTString();
}

/*
* //验证是否为数字
*/
function isNumber(value) {
    var patrn = /^(-)?\d+(\.\d+)?$/;
    if (patrn.exec(value) == null || value == "") {
        return false
    } else {
        return true
    }
}

/*
*倒计时
*/
function resetTime(time, demo) {
    var timer = null;
    var t = time;//1200
    var m = 0;
    var s = 0;
    m = Math.floor(t / 60 % 60);
    m < 10 && (m = '0' + m);
    s = Math.floor(t % 60);

    function countDown() {
        s--;
        s < 10 && (s = '0' + s);
        if (s == '00' && m > 0) {
            s = 59;
            if (m < 10) {
                m = "0" + (Number(m) - 1);
            }
            else {
                m = (Number(m) - 1);
            }
            $("#" + demo).text(m + ":" + s);
        }
        else if (m == '00' && s != "00") {
            $("#" + demo).text(m + ":" + s);

        }
        else if (m == '00' && s == "00") {
            m = '00';
            s = '00';
            $("#" + demo).text(m + ":" + s);
            clearInterval(timer);
        }
        else {
            $("#" + demo).text(m + ":" + s);
        }


    }

    timer = setInterval(countDown, 1000);
}


//退出登录
function logout(url) {
    utils.ajaxRequest({
        url: contextPath + '/foying/web/admin/Login/logout',
        data: null,
        success: function (res) {
            //获取成功
            if (res.ResCode == '100') {
                console.log(res.ResMsg);
            }
        },
        error: function (xhr, type, errorThrown) {
            console.log('退出登录失败:' + type);
        },
        complete: function (XMLHttpRequest, textStatus) {
            localStorage.removeItem('admin');
            window.top.location.href = url ? url : './Login.html';
        }
    })
}

//获取复选框的值，用','拼接
function getCheckboxValue(req) {
    var tempName;
    $('.layui-form-checkbox').each(function () {
        if ($(this).hasClass('layui-form-checked')) {
            var attrName = $(this).prev('input').attr('name');
            var attrVal = $(this).prev('input').val();
            if (tempName && tempName === attrName) {
                req[attrName] += ',' + attrVal;
            } else {
                req[attrName] = attrVal;
                tempName = attrName;
            }
        }
    });
    return req;
}

/**
 * 获取复选框的文本，用','拼接
 * @param req
 * @returns {*}
 */
function getCheckboxTitle(req) {
    var tempName;
    $('.layui-form-checkbox').each(function () {
        if ($(this).hasClass('layui-form-checked')) {
            var attrName = $(this).prev('input').attr('titleKey');
            var attrVal = $(this).prev('input').attr('title');
            if (tempName && tempName === attrName) {
                req[attrName] += ',' + attrVal;
            } else {
                req[attrName] = attrVal;
                tempName = attrName;
            }
        }
    });
    return req;
}

/**
 * 绑定接口数据
 * @param {Object} obj 接口entity/getRequest()
 */
function setFormValue(form, obj) {
    //需要绑定的多个单选框
    var elements = $('input[type="radio"]');
    if (elements && elements.length > 0) {
        for (var i = 0; i < elements.length; i++) {
            var item = elements[i];
            //绑定字段
            var field = $(item).attr('name');
            if (!field) {
                console.warn("请输入绑定字段");
            } else {
                //接口对应字段的值
                var value = obj[field];
                if (value) {
                    var rd = $('input[type="radio"][name="' + field + '"][value="' + value + '"]');
                    if (rd[0] == null) {
                        //“其他”单选框,设选中，设置值，后面输入框设置同样值
                        var radioOther = $('input[type="radio"][name="' + field + '"][value=""]');
                        var inputOhter = radioOther.parent().find('input[data-input="other"]');
                        radioOther.prop('checked', 'true');
                        radioOther.val(value);
                        inputOhter.val(value);
                        inputOhter.attr('disabled', false).removeClass('layui-disabled');
                    } else {
                        rd.prop('checked', 'true');
                    }

                }
            }
        }
    }
    //需要绑定的多个复选框
    var elements = $('input[type="checkbox"]');
    if (elements && elements.length > 0) {
        for (var i = 0; i < elements.length; i++) {
            var item = elements[i];
            //绑定字段
            var field = $(item).attr('name');
            if (!field) {
                console.warn("请输入绑定字段");
            } else {
                //接口对应字段的值,复选框的值：1,2,3,4,5,6,7
                var value = obj[field];
                if (!value || typeof (value) != 'string') {
                    continue;
                }
                //
                $(item).removeAttr('checked');
                // 拆分成数组[1,2,3,4,5,6,7,8]
                var checkedList = value.split(',');
                //遍历数组
                if (checkedList && checkedList.length > 0) {
                    for (var j = 0; j < checkedList.length; j++) {
                        var cb = $('input[type="checkbox"][name="' + field + '"][value="' + checkedList[j] + '"]');
                        if (cb[0] == null) {
                            //“其他”复选框,设选中，设置值，后面输入框设置同样值
                            var checkboxOther = $('input[type="checkbox"][name="' + field + '"][value=""]');
                            var inputOhter = checkboxOther.parent().find('input[data-input="other"]');
                            checkboxOther.prop('checked', 'true');
                            checkboxOther.val(checkedList[j]);
                            inputOhter.val(checkedList[j]);
                            inputOhter.attr('disabled', false).removeClass('layui-disabled');
                        } else {
                            cb.prop('checked', 'true');
                        }
                    }
                }
            }
        }
    }
    form.render();
}

/**
 * 判断list是否为空
 * @param {Object} list
 */
function isListEmpty(list) {
    if (list == null || list.length == 0) {
        return true;
    }
    return false;
}