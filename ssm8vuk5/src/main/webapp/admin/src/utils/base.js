const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm8vuk5/",
            name: "ssm8vuk5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm8vuk5/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区生鲜电商平台"
        } 
    }
}
export default base
