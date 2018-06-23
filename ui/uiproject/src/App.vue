<template>
  <div id="app">
   <van-nav-bar
      title="用户登录"
      left-text="返回"
      left-arrow   
    />
    <div class="loginWapper">
    <van-cell-group>
        <van-field
          name="username"
          v-model="username"
          label="用户名"
          icon="clear"
          placeholder="请输入用户名"
          v-validate="'required'"
          data-vv-as="用户名"
          required
          @click-icon="username = ''"
        />
        <div v-show="errors.has('username')" class="help is-danger">{{ errors.first('username') }}</div>
        <van-field
          name="password"
          data-vv-as="密码"
          v-model="password"
          v-validate="'required'"
          type="password"
          label="密码"
          placeholder="请输入密码"
          required
        />
       <div v-show="errors.has('password')" class="help is-danger">{{ errors.first('password') }}</div>
      </van-cell-group>
      <div style="text-align:center;margin-top:10px;">
        <van-button class="loginButton" size="normal" type="default" @click="login">登录</van-button>
      </div>
    </div>
   </div>  
</template>

<script>
import { NavBar, Checkbox, CheckboxGroup, Card, SubmitBar, Cell, CellGroup, Field, Button, Row, Col } from 'vant';

export default {
  components: {
    [NavBar.name]: NavBar,
    [Card.name]: Card,
    [Checkbox.name]: Checkbox,
    [SubmitBar.name]: SubmitBar,
    [CheckboxGroup.name]: CheckboxGroup,
    [Cell.name]: Cell,
    [CellGroup.name]: CellGroup,
    [Field.name]: Field,
    [Button.name]: Button,
    [Row.name]: Row,
    [Col.name]: Col
  },
  data() {
    return {
      username: '',
      password: ''
    };
  },
  methods: {
    login: function() {
      this.$validator.validateAll().then((result) => {
        if (result) {
          alert('提交');
        }
      });
    }
  }
};
</script>

<style>
body {
  background-color: #f8f8f8;
}
.help{color: red;font-size: 12px;}
.van-cell__title .van-icon {
  font-size: 18px;
}
</style>
