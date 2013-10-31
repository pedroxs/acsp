<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="../../includes/header.jsp"/>

<div class="clearfix">
    <table class="table table-striped table-hover table-condensed datatabled">
        <thead>
        <th>Nome do aluno</th>
        <th>Código anac</th>
        <th>CPF</th>
        <th>Nome de Pista</th>
        <th>CHT</th>
        <th>CMA</th>
        <th>Ativo</th>
        <th></th>
        </thead>
        <tbody>
        <c:forEach var="aluno" items="${listaDeAlunos}">
            <tr id="<c:out value="${aluno.id}"/>">
                <td><c:out value="${aluno.nome}"/></td>
                <td><c:out value="${aluno.codigoANAC}"/></td>
                <td><c:out value="${aluno.cpf}"/></td>
                <td><c:out value="${aluno.nomePista}"/></td>
                <td><c:out value="${aluno.cht}"/></td>
                <td><c:out value="${aluno.cma}"/></td>
                <td><span class="${aluno.ativo?'icon-check':'icon-check-empty'}"></span></td>
                <td>
                    <div class="btn-group btn-custom-block">
                        <span class="icon-edit icon-2x editaAction"></span>
                        <span class="icon-remove-circle icon-2x apagaAction"></span>
                        <span class="icon-plane icon-2x aeronaveAction"></span>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<!-- Button trigger modal -->
<a id="alunoModalBtn" data-toggle="modal" href="#myModal" class="btn btn-primary btn-lg">Novo Aluno</a>

<jsp:include page="formulario.jsp"/>
<jsp:include page="formularioAeronavesHabilitadas.jsp"/>

<jsp:include page="../../includes/footer.jsp"/>