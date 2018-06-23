import Vue from 'vue';
import VeeValidate from 'vee-validate';
import zh_CN from 'vee-validate/dist/locale/zh_CN';
import 'vant/lib/vant-css/index.css';
import App from './App.vue';

const config = {
  errorBagName: 'errors', // change if property conflicts.
  delay: 0,
  locale: 'zh_CN',
  i18nRootKey: 'validation',
  dictionary: {
    zh_CN
  },
  strict: true
};

Vue.use(VeeValidate, config);

new Vue({
  el: '#app',
  render: h => h(App)
});
