// 이미지 타입 및 스테인 설정
setImageType('BRIGHTFIELD_H_E')
setColorDeconvolutionStains('{"Name" : "H&E default", "Stain 1" : "Hematoxylin", "Values 1" : "0.6511078257574492 0.7011930431234068 0.29049426072255424", "Stain 2" : "Eosin", "Values 2" : "0.2158989356208711 0.8011960501132094 0.5580972485873468", "Background" : " 255 255 255"}')

// 전체 이미지 영역을 annotation으로 자동 생성
createSelectAllObject(true)  // true면 기존 annotation 제거 후 전체 선택

// 전체 annotation을 선택 상태로 만들기
selectAnnotations()

// Positive Cell Detection 실행
runPlugin('qupath.imagej.detect.cells.PositiveCellDetection', '{"detectionImageBrightfield":"Hematoxylin OD","backgroundByReconstruction":true,"backgroundRadius":15.0,"medianRadius":0.0,"sigma":2.0,"minArea":10.0,"maxArea":1000.0,"threshold":0.005,"maxBackground":2.0,"watershedPostProcess":true,"cellExpansion":5.0,"includeNuclei":true,"smoothBoundaries":true,"makeMeasurements":true,"thresholdCompartment":"Nucleus: Eosin OD mean","thresholdPositive1":0.2,"thresholdPositive2":0.4,"thresholdPositive3":0.6000000000000001,"singleThreshold":true}')

// 분석 결과 저장
saveAnnotationMeasurements()
