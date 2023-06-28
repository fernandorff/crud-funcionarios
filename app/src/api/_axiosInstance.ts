import axios, { AxiosInstance } from "axios";

const ApiUrl: string =
  "https://crud-funcionarios-production.up.railway.app/";

const axiosInstance: AxiosInstance = axios.create({
  baseURL: ApiUrl,
  timeout: 20000,
  withCredentials: false,
});

export default axiosInstance;
