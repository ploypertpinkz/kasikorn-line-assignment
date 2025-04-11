const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = {
  entry: {
    splash: './js/splash.js',
    pin: './js/pin.js',
    user: './js/bank_main.js'
  },
  output: {
    path: path.resolve(__dirname, 'dist'),
    filename: 'js/[name].js',
    clean: true
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: './html/splash.html',
      filename: 'splash.html',
      chunks: ['splash']
    }),
    new HtmlWebpackPlugin({
      template: './html/pin.html',
      filename: 'pin.html',
      chunks: ['pin']
    }),
    new HtmlWebpackPlugin({
      template: './html/bank_main.html',
      filename: 'bank_main.html',
      chunks: ['user']
    }),
  ],
  mode: 'production'
};
